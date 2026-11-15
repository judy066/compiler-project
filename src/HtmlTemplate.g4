grammar HtmlTemplate;

// --- 1. Lexer Rules for HTML & Thymeleaf ---

TAG_OPEN          : '<';
TAG_CLOSE         : '>';
TAG_SLASH_CLOSE   : '/>';
TAG_END_PREFIX    : '</';

TH_TEXT           : 'th:text';
TH_EACH           : 'th:each';
TH_IF             : 'th:if';
TH_OBJECT         : 'th:object';

EQUALS            : '=';
ATTR_VAL          : '"' (~["\r\n])* '"' ;
TAG_NAME          : [a-zA-Z0-9_-]+;
TEXT_CONTENT      : ~[<]+;

WS                : [ \t\r\n]+ -> skip;

// --- 2. Parser Rules ---

htmlDocument
    : htmlElement*
    ;

htmlElement
    : selfClosingTag
    | normalTag
    ;

normalTag
    : TAG_OPEN TAG_NAME attribute* TAG_CLOSE content* TAG_END_PREFIX TAG_NAME TAG_CLOSE
    ;

selfClosingTag
    : TAG_OPEN TAG_NAME attribute* TAG_SLASH_CLOSE
    ;

attribute
    : TAG_NAME EQUALS ATTR_VAL
    | thymeleafAttribute EQUALS ATTR_VAL
    ;

thymeleafAttribute
    : TH_TEXT
    | TH_EACH
    | TH_IF
    | TH_OBJECT
    ;

content
    : TEXT_CONTENT
    | htmlElement
    ;