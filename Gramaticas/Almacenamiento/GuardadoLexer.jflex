package com.froi.gcic.gramaticas.almacenamiento;

import static com.froi.gcic.gramaticas.almacenamiento.GuardadoParserSym.*;
import java_cup.runtime.*;

%%
%public
%class GuardadoLexer
%cup
%unicode
%line
%column

%{

%}

TerminacionLinea = [\r|\n|\r\n]
WS = [ \t\f]
Ignore = {TerminacionLinea} | [ \t\f]

DBCAPTCHAS = "db.captchas"
ID = "\"ID\""
NOMBRE = "\"NOMBRE\""
LINK = "\"LINK\""
PATH = "\"PATH\""
CANTUSOS = "\"CANTUSOS\""
ACIERTOS = "\"ACIERTOS\""
FALLOS = "\"FALLOS\""

PARA = "("
PARC = ")"
LLAA = "{"
LLAC = "}"
COMA = ","
PUNTOS = ":"

ALLCHAR = "\"" ([^ \"] | " ")* "\""

%%

<YYINITIAL> {
    {DBCAPTCHAS}    {return new Symbol(DBCAPTCHAS, yyline+1, yycolumn+1, yytext());}
    {ID}            {System.out.println("ID - " + yytext()); return new Symbol(ID, yyline+1, yycolumn+1, yytext());}
    {NOMBRE}        {System.out.println("NOMBRE - " + yytext()); return new Symbol(NOMBRE, yyline+1, yycolumn+1, yytext());}
    {LINK}          {System.out.println("LINK - " + yytext()); return new Symbol(LINK, yyline+1, yycolumn+1, yytext());}
    {PATH}          {System.out.println("PATH - " + yytext()); return new Symbol(PATH, yyline+1, yycolumn+1, yytext());}
    {CANTUSOS}      {System.out.println("CANTUSOS - " + yytext()); return new Symbol(CANTUSOS, yyline+1, yycolumn+1, yytext());}
    {ACIERTOS}      {System.out.println("ACIERTOS - " + yytext()); return new Symbol(ACIERTOS, yyline+1, yycolumn+1, yytext());}
    {FALLOS}        {System.out.println("FALLOS - " + yytext()); return new Symbol(FALLOS, yyline+1, yycolumn+1, yytext());}
    {PARA}          {return new Symbol(PARA, yyline+1, yycolumn+1, yytext());}
    {PARC}          {return new Symbol(PARC, yyline+1, yycolumn+1, yytext());}
    {LLAA}          {return new Symbol(LLAA, yyline+1, yycolumn+1, yytext());}
    {LLAC}          {return new Symbol(LLAC, yyline+1, yycolumn+1, yytext());}
    {COMA}          {return new Symbol(COMA, yyline+1, yycolumn+1, yytext());}
    {PUNTOS}        {return new Symbol(PUNTOS, yyline+1, yycolumn+1, yytext());}
    {ALLCHAR}       {System.out.println("ALLCHAR - " + yytext()); return new Symbol(ALLCHAR, yyline+1, yycolumn+1, yytext());}

    {Ignore}        {/* Ignorar */}
}

[^] {

}