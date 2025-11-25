grammar Perton;

// --- Regras do Parser ---

program: (varDeclaration | function)* main EOF;

varDeclaration: type ID ('=' expression)? ';' # DeclaracaoVar
              ;

type: 'int'    # TipoInt
    | 'float'  # TipoFloat
    | 'string' # TipoString
    ;

function: type ID '(' params? ')' block # DeclaracaoFuncao;

params: param (',' param)* # Parametros;

param: type ID # Parametro;

main: 'void' 'main' '(' ')' block # FuncaoPrincipal;

block: '{' (varDeclaration | statement)* '}' # BlocoCodigo
     ;

statement: assignment           # StmtAssignment
         | ifStatement          # StmtIf
         | whileStatement       # StmtWhile
         | forStatement         # StmtFor
         | doWhileStatement     # StmtDoWhile
         | readStatement        # StmtRead
         | writeStatement       # StmtWrite
         | expression ';'       # StmtExpression
         | returnStatement      # StmtReturn
         | block                # StmtBlock
         ;

assignment: ID '=' expression ';' # Atribuicao;

returnStatement: 'return' expression? ';' # Retorno;

// Estruturas de controle

ifStatement: 'if' '(' expression ')' statement ('else' statement)? # Condicional;

whileStatement: 'while' '(' expression ')' statement # LoopWhile;

// For Statement
forStatement: 'for' '(' forInit expression? ';' forUpdate? ')' statement # LoopFor;

forInit: varDeclaration      # ForInitDecl
       | assignment          # ForInitAssign
       | expression ';'      # ForInitExpr
       | ';'                 # ForInitEmpty
       ;

forUpdate: ID '=' expression # ForUpdateAssign
         | expression        # ForUpdateExpr
         ;

doWhileStatement: 'do' statement 'while' '(' expression ')' ';' # LoopDoWhile;

// I/O
readStatement: 'scanf' '(' formatString ',' '&' ID ')' ';' # Leitura;

writeStatement: 'printf' '(' formatString (',' expression)* ')' ';' # Escrita;

formatString: STRING # StringFormatada;

// Expressões com precedência

expression: logicalOrExpression
          ;

logicalOrExpression: logicalAndExpression ('||' logicalAndExpression)*
                   ;

logicalAndExpression: equalityExpression ('&&' equalityExpression)*
                    ;

equalityExpression: relationalExpression (('==' | '!=') relationalExpression)*
                  ;

relationalExpression: additiveExpression (('<' | '>' | '<=' | '>=') additiveExpression)*
                    ;

additiveExpression: multiplicativeExpression (('+' | '-') multiplicativeExpression)*
                  ;

multiplicativeExpression: unaryExpression (('*' | '/' | '%') unaryExpression)*
                        ;

unaryExpression: ('!' | '-') unaryExpression # Unario
               | primaryExpression           # Primario
               ;

primaryExpression: INT                      # NumeroInteiro
                 | FLOAT                    # NumeroDecimal
                 | STRING                   # Texto
                 | ID                       # Variavel
                 | ID '(' exprList? ')'     # ChamadaFuncao
                 | '(' expression ')'       # ExpressaoParenteses
                 ;

exprList: expression (',' expression)* # ListaExpressoes;

// --- Regras do Lexer ---

T_INT: 'int';
T_FLOAT: 'float';
T_STRING: 'string';
VOID: 'void';
MAIN: 'main';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
DO: 'do';
FOR: 'for';
SCANF: 'scanf';
PRINTF: 'printf';
RETURN: 'return';

OP_OR: '||';
OP_AND: '&&';
OP_EQ: '==';
OP_NE: '!=';
OP_LT: '<';
OP_GT: '>';
OP_LE: '<=';
OP_GE: '>=';
OP_PLUS: '+';
OP_MINUS: '-';
OP_MULT: '*';
OP_DIV: '/';
OP_MOD: '%';
OP_NOT: '!';
OP_ASSIGN: '=';

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
SEMICOLON: ';';
COMMA: ',';
AMP: '&';

INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]* | '.' [0-9]+;
STRING: '"' (~["\\\r\n] | '\\' ["\\nrt])* '"';
ID: [a-zA-Z_][a-zA-Z_0-9]*;
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;