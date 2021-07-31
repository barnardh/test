lexer grammar TestLexer;

@header {
package com.example.test;
}

OUTPUT:'output';
PACKAGE:'package';
STRUCT:'struct';
CLASS:'class';

// §3.11 Separators
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
SEMI : ';';
COMMA : ',';
DOT : '.';

LIST : 'List';
MAP  : 'Map';

ID : ('a'..'z' | 'A'..'Z'| '1'..'9' | '#' | '*' | '<' | '>')+ ;
/*TYPE : ('a'..'z' | 'A'..'Z'| '1'..'9' | '*')+ ;*/

/*
FUNCTION_NAME : ID ;
CLASS_NAME : ID ;
STRUCT_NAME : ('a'..'z' | 'A'..'Z'| '1'..'9' | '#')+ ; */
PACKAGE_NAME : ID ('.' ID)* ;
ANNOTATION_NAME : AT ID ; 

// §3.12 Operators
BACKTICK : '`';
ASSIGN : '=';
GT : '>';
LT : '<';
BANG : '!';
TILDE : '~';
QUESTION : '?';
COLON : ':';
EQUAL : '==';
LE : '<=';
GE : '>=';
NOTEQUAL : '!=';
AND : '&&';
OR : '||';
INC : '++';
DEC : '--';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
BITAND : '&';
BITOR : '|';
CARET : '^';
MOD : '%';
ARROW : '->';
COLONCOLON : '::';
DOUBEQOATE : '"';


AT : '@';
ELLIPSIS : '...';

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT 
    :   '//' ~[\r\n]* -> skip
    ;
