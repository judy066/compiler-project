grammar CssStyle;

// --- 1. Lexer Rules for CSS ---

SELECTOR      : [a-zA-Z0-9_\- #.]+ ;
PROPERTY      : [a-zA-Z\-]+ ;
VALUE         : [a-zA-Z0-9_%#.]+ ;

LBRACE        : '{';
RBRACE        : '}';
COLON         : ':';
SEMI          : ';';

WS            : [ \t\r\n]+ -> skip ;

// --- 2. Parser Rules ---

stylesheet
    : ruleSet*
    ;

ruleSet
    : SELECTOR LBRACE declaration* RBRACE
    ;

declaration
    : PROPERTY COLON VALUE SEMI
    ;