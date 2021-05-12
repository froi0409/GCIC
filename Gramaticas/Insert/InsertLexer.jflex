//Sección de Importaciones
package com.froi.pruebas.gramaticas;
import java_cup.runtime.*;
import static com.froi.pruebas.gramaticas.InsertParserSym.*;

%%
%public
%class EtiquetadoLexer
%cup
%unicode
%line
%column

%{
    /* CODIGO AÑADIDO */    
%}

%eof{
    /* CODIGO EJECUTADO AL FINAL DEL ANALISIS */
%eof}

//Definición de expresiones regulares específicas
TerminacionLinea = [\r|\n|\r\n]
WS = [ \t\f]
Ignore = {TerminacionLinea} | [ \t\f]

/* COMODINES */
VOCALES_ESPECIALES = [áÁ] | [éÉ] | [íÍ] | [óÓ] | [úÚ] | [üÚ]
ALFABETICO = ([a-zA-Z] | {VOCALES_ESPECIALES} )+
ALFANUMERICO = ([a-zA-Z] | [0-9] | {VOCALES_ESPECIALES})+
DIGITO = ( [0-9] | [1-9][0-9]+ ) //No acepta cadenas como 0000
NUMERO = {DIGITO} ([.] ([0]*) ( [1-9] | [1-9][0-9]+ )? )
TEXTO = ( {IDENTIFICADOR} | {ALFANUMERICO} | {VOCALES_ESPECIALES} | [^"<" ">" \n " " "!!" "</"] ) ( {Ignore} | {IDENTIFICADOR} | {ALFANUMERICO} | [^"<" ">"] )+
DIGITO_COM = "\""{WS}*{DIGITO}{WS}*"\""
ID_ETIQUETA = "\"" ({ALFANUMERICO} | [_] | [-] | [$])+ "\""
ALLCHAR = "\"" [^\"]+ "\""
ALLCHARNOSPACE = "\"" [^\" " " "\n"]+ "\""
IDENTIFICADOR = [a-zA-Z] ( {ALFANUMERICO} | [_] )+

/* ETIQUETAS GCIC */
GCIC = [cC][_][gG][cC][iI][cC]
HEAD = [cC][_][hH][eE][aA][dD]
TITLE =[cC][_][tT][iI][tT][lL][eE]
LINK = [cC][_][lL][iI][nN][kK]
BODY = [cC][_][bB][oO][dD][yY]
SPAM = [cC][_][sS][pP][aA][mM]
INPUT= [cC][_][iI][nN][pP][uU][tT]
TEXTAREA = [cC][_][tT][eE][xX][tT][aA][rR][eE][aA]
SELECT = [cC][_][sS][eE][lL][eE][cC][tT]
OPTION = [cC][_][oO][pP][tT][iI][oO][nN]
DIV = [cC][_][dD][iI][vV]
IMG = [cC][_][iI][mM][gG]
BR = [cC][_][bB][rR]
BUTTON = [cC][_][bB][uU][tT][tT][oO][nN]
H1 = [cC][_][hH][1]
P = [cC][_][pP]
SCRIPTING = [cC][_][sS][cC][rR][iI][pP][tT][iI][nN][gG]

/* PARAMETROS DE ETIQUETAS */
HREF = "href"
BACKGROUND = "background"
COLOR = "color"
FONTSIZE = "font-size"
FONTFAMILY = "font-family"
TEXTALIGN = "text-align"
TYPE = "type"
ID = "id"
NAME = "name"
COLS = "cols"
ROWS = "rows"
CLASS = "class"
SRC = "src"
WIDTH = "width"
HEIGHT = "heigth"
ALT = "alt"
ONCLICK = "onclick"

/* PALABRAS DE LOS PARAMETROS */
BLACK = "\""{WS}*"black"{WS}*"\""
OLIVE = "\""{WS}*"olive"{WS}*"\""
TEAL = "\""{WS}*"teal"{WS}*"\""
RED = "\""{WS}*"red"{WS}*"\""
BLUE = "\""{WS}*"blue"{WS}*"\""
MAROON = "\""{WS}*"maroon"{WS}*"\""
NAVY = "\""{WS}*"navy"{WS}*"\""
GRAY = "\""{WS}*"gray"{WS}*"\""
LIME = "\""{WS}*"lime"{WS}*"\""
FUCHSIA = "\""{WS}*"fuchsia"{WS}*"\""
GREEN = "\""{WS}*"green"{WS}*"\""
WHITE = "\""{WS}*"white"{WS}*"\""
PURPLE = "\""{WS}*"purple"{WS}*"\""
SILVER = "\""{WS}*"silver"{WS}*"\""
YELLOW = "\""{WS}*"yellow"{WS}*"\""
AQUA = "\""{WS}*"aqua"{WS}*"\""
HEXADECIMAL = "\""{WS}*"#"[a-fA-F0-9]+{WS}*"\""

PIXELES = "\""{WS}* {DIGITO} {WS}* [pP][xX] {WS}* "\""
PORCENTAJE = "\""{WS}*{DIGITO} {WS}* "%"{WS}* "\""

COURIER = "\""{WS}*"Courier"{WS}*"\""
VERDANA = "\""{WS}*"Verdana"{WS}*"\""
ARIAL = "\""{WS}*"Arial"{WS}*"\""
GENEVA = "\""{WS}*"Geneva"{WS}*"\""
SANS_SERIF = "\""{WS}*"sans-serif"{WS}*"\""

LEFT = "\""{WS}*"left"{WS}*"\""
RIGHT = "\""{WS}*"right"{WS}*"\""
CENTER = "\""{WS}*"center"{WS}*"\""
JUSTIFY = "\""{WS}*"justify"{WS}*"\""

TEXT = "\""{WS}*"text"{WS}*"\""
NUMBER = "\""{WS}*"number"{WS}*"\""
RADIO = "\""{WS}*"radio"{WS}*"\""
CHECKBOX = "\""{WS}*"checkbox"{WS}*"\""
ROW = "\""{WS}*"row"{WS}*"\""
COLUMN = "\""{WS}*"column"{WS}*"\""


/**/
CORA = "["
CORC = "]"
IGUAL = "="
MENOR_CIERRE = "<" {WS}* "/"
MENOR_QUE = "<"
MAYOR_QUE = ">"


//Comentarios
COMENTARIO_LINEA = "!!" [^\r\n]*
COMENTARIO_BLOQUE = "<!--" [^-] ~"-->" | "<!--" "-"+ ">"
COMENTARIO = {COMENTARIO_BLOQUE} | {COMENTARIO_LINEA}

%%

<YYINITIAL> {

    {COMENTARIO}                {/* IGNORAR */}
    /* SIGNOS FUNDAMENTALES */

    /* PALABRAS RESERVADAS DE ETIQUETAS GCIC */
    {GCIC}                      {return new Symbol(GCIC, yyline, yycolumn, yytext());}
    {HEAD}                      {return new Symbol(HEAD, yyline, yycolumn, yytext());}
    {TITLE}                     {return new Symbol(TITLE, yyline, yycolumn, yytext());}
    {LINK}                      {return new Symbol(LINK, yyline, yycolumn, yytext());}
    {BODY}                      {return new Symbol(BODY, yyline, yycolumn, yytext());}
    {SPAM}                      {return new Symbol(SPAM, yyline, yycolumn, yytext());}
    {INPUT}                     {return new Symbol(INPUT, yyline, yycolumn, yytext());}
    {TEXTAREA}                  {return new Symbol(TEXTAREA, yyline, yycolumn, yytext());}
    {SELECT}                    {return new Symbol(SELECT, yyline, yycolumn, yytext());}
    {OPTION}                    {return new Symbol(OPTION, yyline, yycolumn, yytext());}
    {DIV}                       {return new Symbol(DIV, yyline, yycolumn, yytext());}
    {IMG}                       {return new Symbol(IMG, yyline, yycolumn, yytext());}
    {BR}                        {return new Symbol(BR, yyline, yycolumn, yytext());}
    {BUTTON}                    {return new Symbol(BUTTON, yyline, yycolumn, yytext());}
    {H1}                        {return new Symbol(H1, yyline, yycolumn, yytext());}
    {P}                         {return new Symbol(P, yyline, yycolumn, yytext());}
    {SCRIPTING}                 {return new Symbol(SCRIPTING, yyline, yycolumn, yytext());}

    /* PARAMETROS DE ETIQUETAS */
    {HREF}                      {return new Symbol(HREF, yyline, yycolumn, yytext());}
    {BACKGROUND}                {return new Symbol(BACKGROUND, yyline, yycolumn, yytext());}
    {COLOR}                     {return new Symbol(COLOR, yyline, yycolumn, yytext());}
    {FONTSIZE}                  {return new Symbol(FONTSIZE, yyline, yycolumn, yytext());}
    {FONTFAMILY}                {return new Symbol(FONTFAMILY, yyline, yycolumn, yytext());}
    {TEXTALIGN}                 {return new Symbol(TEXTALIGN, yyline, yycolumn, yytext());}
    {TYPE}                      {return new Symbol(TYPE, yyline, yycolumn, yytext());}
    {ID}                        {return new Symbol(ID, yyline, yycolumn, yytext());}
    {NAME}                      {return new Symbol(NAME, yyline, yycolumn, yytext());}
    {COLS}                      {return new Symbol(COLS, yyline, yycolumn, yytext());}
    {ROWS}                      {return new Symbol(ROWS, yyline, yycolumn, yytext());}
    {CLASS}                     {return new Symbol(CLASS, yyline, yycolumn, yytext());}
    {SRC}                       {return new Symbol(SRC, yyline, yycolumn, yytext());}
    {WIDTH}                     {return new Symbol(WIDTH, yyline, yycolumn, yytext());}
    {HEIGHT}                    {return new Symbol(HEIGHT, yyline, yycolumn, yytext());}
    {ALT}                       {return new Symbol(ALT, yyline, yycolumn, yytext());}
    {ONCLICK}                   {return new Symbol(ONCLICK, yyline, yycolumn, yytext());}

    /* PALABRAS DE LOS PARAMETROS */
    {BLACK}                     {return new Symbol(BLACK, yyline, yycolumn, yytext());}
    {OLIVE}                     {return new Symbol(OLIVE, yyline, yycolumn, yytext());}
    {TEAL}                      {return new Symbol(TEAL, yyline, yycolumn, yytext());}
    {RED}                       {return new Symbol(RED, yyline, yycolumn, yytext());}
    {BLUE}                      {return new Symbol(BLUE, yyline, yycolumn, yytext());}
    {MAROON}                    {return new Symbol(MAROON, yyline, yycolumn, yytext());}
    {NAVY}                      {return new Symbol(NAVY, yyline, yycolumn, yytext());}
    {GRAY}                      {return new Symbol(GRAY, yyline, yycolumn, yytext());}
    {LIME}                      {return new Symbol(LIME, yyline, yycolumn, yytext());}
    {FUCHSIA}                   {return new Symbol(FUCHSIA, yyline, yycolumn, yytext());}
    {GREEN}                     {return new Symbol(GREEN, yyline, yycolumn, yytext());}
    {WHITE}                     {return new Symbol(WHITE, yyline, yycolumn, yytext());}
    {PURPLE}                    {return new Symbol(PURPLE, yyline, yycolumn, yytext());}
    {SILVER}                    {return new Symbol(SILVER, yyline, yycolumn, yytext());}
    {YELLOW}                    {return new Symbol(YELLOW, yyline, yycolumn, yytext());}
    {AQUA}                      {return new Symbol(AQUA, yyline, yycolumn, yytext());}
    {HEXADECIMAL}               {return new Symbol(HEXADECIMAL, yyline, yycolumn, yytext());}

    {DIGITO_COM}                {return new Symbol(DIGITO_COM, yyline, yycolumn, yytext());}
    {PIXELES}                   {return new Symbol(PIXELES, yyline, yycolumn, yytext());}
    {PORCENTAJE}                {return new Symbol(PORCENTAJE, yyline, yycolumn, yytext());}

    {COURIER}                   {return new Symbol(COURIER, yyline, yycolumn, yytext());}
    {VERDANA}                   {return new Symbol(VERDANA, yyline, yycolumn, yytext());}
    {ARIAL}                     {return new Symbol(ARIAL, yyline, yycolumn, yytext());}
    {GENEVA}                    {return new Symbol(GENEVA, yyline, yycolumn, yytext());}
    {SANS_SERIF}                {return new Symbol(SANS_SERIF, yyline, yycolumn, yytext());}

    {LEFT}                      {return new Symbol(LEFT, yyline, yycolumn, yytext());}
    {RIGHT}                     {return new Symbol(RIGHT, yyline, yycolumn, yytext());}
    {CENTER}                    {return new Symbol(CENTER, yyline, yycolumn, yytext());}
    {JUSTIFY}                   {return new Symbol(JUSTIFY, yyline, yycolumn, yytext());}
    
    {TEXT}                      {return new Symbol(TEXT, yyline, yycolumn, yytext());}
    {NUMBER}                    {return new Symbol(NUMBER, yyline, yycolumn, yytext());}
    {RADIO}                     {return new Symbol(RADIO, yyline, yycolumn, yytext());}
    {CHECKBOX}                  {return new Symbol(CHECKBOX, yyline, yycolumn, yytext());}
    {ROW}                       {return new Symbol(ROW, yyline, yycolumn, yytext());}
    {COLUMN}                    {return new Symbol(COLUMN, yyline, yycolumn, yytext());}
    
    /* CIERRE */
    {MENOR_CIERRE}              {return new Symbol(MENOR_CIERRE, yyline, yycolumn, yytext());}

    /*  */
    {CORA}                      {return new Symbol(CORA, yyline, yycolumn, yytext());}
    {CORC}                      {return new Symnol(CORC, yyline, yycolumn, yytext());}
    {IGUAL}                     {return new Symbol(IGUAL, yyline, yycolumn, yytext());}
    {MENOR_QUE}                 {return new Symbol(MENOR_QUE, yyline, yycolumn, yytext());}
    {MAYOR_QUE}                 {return new Symbol(MAYOR_QUE, yyline+1, yycollumn+1, yytext());}

    /* COMODINES */
    {ID_ETIQUETA}               {return new Symbol(ID_ETIQUETA, yyline, yycolumn, yytext());}
    {ALLCHARNOSPACE}            {return new Symbol(ALLCHARNOSPACE, yyline, yycolumn, yytext());}
    {ALLCHAR}                   {return new Symbol(ALLCHAR, yyline, yycolumn, yytext());}
    {ALFANUMERICO}              {return new Symbol(ALFANUMERICO, yyline, yycolumn, yytext());}
    {IDENTIFICADOR}             {return new Symbol(IDENTIFICADOR, yyline, yycolumn, yytext());}
    

    /* TEXTO */
    //{TEXTO}                     {return new Symbol(TEXTO, yyline, yycolumn, yytext());}

    {Ignore}                    {/* IGNORAR */}
}

//Caracteres no reconocidos por la gramática
[^] {

}