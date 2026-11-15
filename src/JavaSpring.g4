grammar JavaSpring;

CONTROLLER    : '@Controller';
GET_MAPPING   : '@GetMapping';
POST_MAPPING  : '@PostMapping';
AUTOWIRED     : '@Autowired';
PATH_VARIABLE : '@PathVariable';
MODEL_ATTRIBUTE : '@ModelAttribute';

PUBLIC        : 'public';
CLASS         : 'class';
STRING        : 'String';
VOID          : 'void';
RETURN        : 'return';

LPAREN        : '(';
RPAREN        : ')';
LBRACE        : '{';
RBRACE        : '}';
SEMI          : ';';
COMMA         : ',';
ASSIGN        : '=';

ID            : [a-zA-Z_] [a-zA-Z_0-9]* ;
STRING_LITERAL: '"' (~["\r\n])* '"' ;

WS            : [ \t\r\n]+ -> skip ;

compilationUnit
    : classDeclaration*
    ;

classDeclaration
    : PUBLIC CLASS ID LBRACE classBodyDeclaration* RBRACE
    ;

classBodyDeclaration
    : fieldDeclaration
    | methodDeclaration
    ;

fieldDeclaration
    : ID ID SEMI
    ;

methodDeclaration
    : annotation* PUBLIC returnType ID LPAREN (parameterList)? RPAREN LBRACE methodBody? RBRACE
    ;

annotation
    : CONTROLLER
    | GET_MAPPING LPAREN STRING_LITERAL RPAREN
    | POST_MAPPING LPAREN STRING_LITERAL RPAREN
    | AUTOWIRED
    | PATH_VARIABLE
    | MODEL_ATTRIBUTE
    ;

returnType
    : STRING
    | VOID
    | ID
    ;

parameterList
    : parameter (COMMA parameter)*
    ;

parameter
    : annotation* ID ID
    ;

methodBody
    : statement*
    ;

statement
    : returnStatement
    | expressionStatement
    ;

returnStatement
    : RETURN expression SEMI
    ;

expressionStatement
    : ID ASSIGN expression SEMI
    | ID LPAREN expression? RPAREN SEMI
    ;

expression
    : STRING_LITERAL
    | ID
    ;