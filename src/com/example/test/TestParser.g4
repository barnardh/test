parser grammar TestParser;

options { tokenVocab=TestLexer; }

@header {
package com.example.test;
}

parse 
    : 
    statements* EOF
    ;

statements 
    : outputDecl
    | packageDecl
    | structDecl
    | classDecl
    ;

outputDecl
    : OUTPUT outputAnnotationDecl*?
    ;
 
packageDecl 
    : PACKAGE PACKAGE_NAME
    ;

outputAnnotationDecl
    : name=ANNOTATION_NAME
    ;

structAnnotationDecl
    : name=ANNOTATION_NAME
    ;

classAnnotationDecl
    : name=ANNOTATION_NAME
    ;

structDecl 
    : structAnnotationDecl*? name=ID STRUCT LBRACE variableDecl+ RBRACE
    ;

variableDecl
    : name=ID type=ID tagsDecl?
    | name=ID LIST GT type=ID LT tagsDecl?
    | name=ID MAP GT type=ID COMMA ID LT tagsDecl?
    ;

tagsDecl
    : BACKTICK (tagDecl*?) BACKTICK
    ;

tagDecl
    :name=ID COLON DOUBEQOATE (vale=ID (COMMA?))+ DOUBEQOATE
    ;

classDecl 
    : classAnnotationDecl*? name=ID CLASS LBRACE (functionDeclType)* RBRACE
    ;

functionDeclType
    : name=ID COLON (functionDecl)*
    ;

functionDecl
    : name=ID LPAREN (functionParameterDecl (COMMA)?)*? RPAREN (COLON returnType=ID)?
    ;

functionParameterDecl
    : name=ID type=ID
    ;