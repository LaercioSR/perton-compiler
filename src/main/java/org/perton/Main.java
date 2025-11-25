package org.perton;

import org.perton.generated.PertonLexer;
import org.perton.generated.PertonParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        String input = "int x = 5; void main() { printf(\"Hello: %d\", x); }";

        // Criar o lexer
        CharStream charStream = CharStreams.fromString(input);
        PertonLexer lexer = new PertonLexer(charStream);

        // Criar os tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Criar o parser
        PertonParser parser = new PertonParser(tokens);

        // Iniciar o parsing na regra 'prog'
        ParseTree tree = parser.program();

        // Imprimir a árvore
        System.out.println("Árvore de parsing:");
        System.out.println(tree.toStringTree(parser));
    }
}
