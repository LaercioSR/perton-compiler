package org.perton;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.perton.generated.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try {
            String sourcePath;

            if (args.length > 0) {
                sourcePath = args[0];
            } else {
                sourcePath = "teste.perton";
                System.out.println("Nenhum arquivo especificado. Usando arquivo padrão: " + sourcePath);
                System.out.println("Dica: Para usar outro arquivo, execute: java Main seu_arquivo.perton");
            }

            File file = new File(sourcePath);
            if (!file.exists()) {
                System.err.println("Erro: O arquivo '" + sourcePath + "' não foi encontrado.");
                return;
            }

            String filenameInput = file.getName().replaceFirst("[.][^.]+$", "");

            CharStream input = CharStreams.fromFileName(sourcePath);
            PertonLexer lexer = new PertonLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PertonParser parser = new PertonParser(tokens);

            ParseTree tree = parser.program();

            if (parser.getNumberOfSyntaxErrors() > 0) {
                System.out.println("Compilação cancelada devido a erros sintáticos.");
                return;
            }

            ParseTreeWalker walker = new ParseTreeWalker();
            PertonSemanticListener semanticListener = new PertonSemanticListener();
            walker.walk(semanticListener, tree);

            if (semanticListener.hasErrors()) {
                System.out.println("\n--- ERROS SEMÂNTICOS ENCONTRADOS ---");
                for (String err : semanticListener.getErrors()) {
                    System.out.println(err);
                }
            } else {
                System.out.println("\n[SUCESSO] O código está correto semanticamente!");

                PertonToCListener cGenerator = new PertonToCListener();
                walker.walk(cGenerator, tree);

                String cCode = cGenerator.getCCode();

                String outputDirName = "output";
                File outputDir = new File(outputDirName);

                if (!outputDir.exists()) {
                    outputDir.mkdirs();
                }

                String outputPath = outputDirName + File.separator + filenameInput + ".c";

                try (FileWriter writer = new FileWriter(outputPath)) {
                    writer.write(cCode);
                    System.out.println("\nArquivo gerado com sucesso em: " + outputPath);
                    System.out.println("--- CÓDIGO C GERADO ---");
                    System.out.println(cCode);
                } catch (IOException e) {
                    System.err.println("Erro ao salvar arquivo C: " + e.getMessage());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}