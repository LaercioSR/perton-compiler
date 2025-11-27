# Linguagem PERTON

## Sobre

A linguagem **Perton** é uma linguagem de programação fictícia, estruturada, desenvolvida como requisito avaliativo para a disciplina de Compiladores. Sua sintaxe é inspirada na linguagem C, visando facilitar o aprendizado dos conceitos de compilação e tradução de linguagens de programação.

O compilador desenvolvido realiza a análise léxica, sintática e semântica, além de traduzir o código fonte Perton para a linguagem C (padrão C99), permitindo sua execução nativa após compilação pelo GCC.

## Detalhes da Linguagem

### Tipos de Dados

A linguagem suporta três tipos primitivos de dados:

TIPO | DESCRIÇÃO | EXEMPLO
-----|-----------|--------
`int` (inteiros) | Números inteiros (positivos e negativos) | `42`, `-7`
`float` (ponto flutuante) | Números reais com casas decimais | `3.14`, `-0.001`
`string` (cadeias de caracteres) | Sequências de caracteres alfanuméricos | `"Olá, Mundo!"`, `"Perton123"`

### Estrutura de um Programa Perton

Todo programa em Perton deve possuir uma função principal chamada main, que é o ponto de entrada da execução. O escopo é delimitado por chaves `{ }`.

```c
main {
	// Código do programa
}
```

### Declaração de Variáveis e Atribuição

As variáveis devem ser declaradas com seu tipo explícito. É permitida a inicialização direta na declaração. A atribuição de valores é feita utilizando o operador `=`.

```c
// Declaração simples
int contador;
float nota;

// Declaração com inicialização
string nome = "Perton";
int idade = 25;

// Atribuição posterior
contador = 10;
```

Regras Semânticas:
- Variáveis devem ser declaradas antes do uso.
- Tipos de dados devem ser respeitados durante atribuições e operações.
- Não é permitido declarar variáveis com o mesmo nome no mesmo escopo.
- Strings devem ser delimitadas por aspas duplas (`"`).

### Entrada e Saída (I/O)

A linguagem fornece comandos nativos para leitura e escrita, mapeados diretamente para as funções da biblioteca padrão do C.

#### Entrada de Dados (`scanf`)

Lê valores do teclado e armazena em variáveis. Exige o uso do operador & antes da variável.

```c
int valor;
scanf("%d", &valor);
```

#### Saída de Dados (`printf`)

Imprime texto e valores na tela. Suporta formatação estilo C.

```c
printf("Ola Mundo");
printf("A idade é %d e a nota é %f", idade, nota);
```

### Estruturas de Controle

A linguagem Perton inclui as seguintes estruturas de controle:
- **Condicional** (`if`/`else`)
```c
if (nota >= 6.0) {
    printf("Aprovado");
} else {
    printf("Reprovado");
}
```
- **Laço**: (`while`)
```c
while (i < 10) {
		i = i + 1;
}
```
- **Laço**: (`do-while`)
```c
do {
    printf("Executa pelo menos uma vez");
} while (condicao > 0);
```
- **Laço**: (`for`)
Suporta inicialização, condição e atualização na assinatura do laço.
```c
for (int i = 0; i < 10; i = i + 1) {
    printf("Contador: %d", i);
}
```

### Funções

Além da main, o usuário pode definir funções auxiliares. As funções devem ser declaradas antes de serem chamadas ou no escopo global.

```c
int soma(int a, int b) {
    return a + b;
}

void main() {
    int res = soma(5, 3);
    printf("Resultado: %d", res);
}
```

### Operações Aritméticas e Relacionais

A gramática respeita a precedência matemática padrão (multiplicação antes de soma, parênteses têm prioridade).

- **Aritméticos**: `+`, `-`, `*`, `/`, `%`
- **Relacionais**: `==`, `!=`, `<`, `>`, `<=`, `>=`
- **Lógicos**: `&&` (E), `||` (OU), `!` (NÃO)

## Gramática Formal

A gramática formal da linguagem Perton é definida usando o ANTLR4, conforme o arquivo [`Perton.g4`](./src/Perton.g4) presente no repositório.

## Compilador

O compilador Perton é implementado em **JAVA** utilizando a biblioteca **ANTLR4** para análise léxica e sintática. Com o auxilio do ANTLR4 foi possível gerar automaticamente o analisador léxico e sintático a partir da gramática formal definida. Além disso, foi construído um analisador semântico para garantir a correção dos programas Perton e um gerador de código para traduzir o código Perton para C99.

O código fonte do compilador está disponível na pasta [`src/`](./src/) deste repositório.

## Como Usar

O compilador Perton possui uma versão built que pode ser executada diretamente com o Java Runtime Environment (JRE). Certifique-se de ter o JRE instalado em sua máquina.

O executável do compilador está disponível na pasta [`build/`](./build/) deste repositório.

### Passos para Compilar um Programa Perton

1. Escreva seu código Perton em um arquivo com a extensão `.perton`, por exemplo, `programa.perton`.
2. Abra o terminal e navegue até a pasta onde está o arquivo do compilador (`PertonCompiler.jar`).
3. Execute o seguinte comando para compilar seu programa Perton:

	 ```bash
	 java -jar PertonCompiler.jar caminho/para/seu/programa.perton
	 ```
4. O compilador gerará um arquivo C com o mesmo nome do arquivo Perton na pasta `output`, mas com a extensão `.c`, por exemplo, `programa.c`.
5. Para compilar o arquivo C gerado, utilize o GCC:

	 ```bash
	 gcc output/programa.c -o output/programa
	 ```
6. Execute o programa compilado:

	 ```bash
	 ./output/programa
	 ```

### Exemplos Completos

O projeto possui alguns exemplos de programas Perton na pasta [`examples/`](./examples/). Você pode utilizá-los para testar o compilador e entender melhor a sintaxe da linguagem.

Para compilar e executar um exemplo, siga os passos descritos acima, substituindo `caminho/para/seu/programa.perton` pelo caminho do arquivo de exemplo desejado.