//Sección de Importaciones
package com.froi.gcic.gramaticas.etiquetado;
import java_cup.runtime.*;
import static com.froi.gcic.gramaticas.etiquetado.EtiquetadoParserSym.*;

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
ALLCHAR_COMSIMP = {COM_SIMP} ([^\' \‘ \’] | " ")+ {COM_SIMP}

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


/* FUNCIONES ESPECIALES DE CLC */
ASC = "ASC"
DESC = "DESC"
LETPAR_NUM  = "LETPAR_NUM"
LETIMPAR_NUM = "LETIMPAR_NUM"
REVERSE = "REVERSE"
CARACTER_ALEATORIO = "CARACTER_ALEATORIO"
NUM_ALEATORIO = "NUM_ALEATORIO"
ALERT_INFO = "ALERT_INFO"
EXIT = "EXIT"
REDIRECT = "REDIRECT"
GETBYID = "getElementById"
INIT = "INIT"
END = "END"
IF = "IF"
THEN = "THEN"
ELSE = "ELSE"
REPEAT = "REPEAT"
HUNTIL = "HUNTIL"
WHILE = "WHILE"
THENWHILE  = "THENWHILE"
INSERT = "INSERT"

/* LENGUAJE DE ALTO NIVEL EMBEBIDO */
ON_LOAD = "ON_LOAD"
PROCESS = ("PROCESS_") ({ALFANUMERICO})

/*TIPOS DE DATOS */
INTEGER = "integer"
DECIMAL = "decimal"
BOOLEAN = "boolean"
CHAR = "char"
STRING = "string"
GLOBAL = "@global"

/* DEFINICION DE TIPOS DE DATOS */
D_INTEGER = {DIGITO}
D_DECIMAL = {NUMERO}
TRUE = "true"
FALSE = "false"
D_CHAR = {COM_SIMP} [^"'" "’" "‘"] {COM_SIMP}
D_STRING = [\"] [^\"] [\"]

/* CIERRE */
MENOR_CIERRE = "<" {WS}* "/"

/* OPERADORES RELACIONALES */
IGUAL_IGUAL = "=="
DIFERENTE_IGUAL = "!="
MENOR_QUE = "<"
MENOR_IGUAL = "<="
MAYOR_QUE = ">"
MAYOR_IGUAL = ">="

/* OPERADORES LOGICOS */
OR = "||"
AND = "&&"
NOT = "!"

/* OPERADORES ARITMETICOS */
SUMA = "+"
RESTA = "-"
MULTIPLICACION = "*"
DIVISION = "/"

/* SIMBOLOS ESPECIALES */
IGUAL = "="
BARRA = "|"
DIAGONAL = "/"
PARA = "("
PARC = ")"
CORA = "["
CORC = "]"
LLAA = "{"
LLAC = "}"
PUNTO_COMA = ";"
PUNTOS = ":"
COM_SIMP = ("'" | "‘" | "’")
IDENTIFICADOR = [a-zA-Z] ({ALFANUMERICO} | [_])+
COMA = ","

//Comentarios
COMENTARIO_LINEA = "!!" [^\r\n]*
COMENTARIO_BLOQUE = "<!--" [^-] ~"-->" | "<!--" "-"+ ">"
COMENTARIO = {COMENTARIO_BLOQUE} | {COMENTARIO_LINEA}

%%

<YYINITIAL> {

    {COMENTARIO}                {/* IGNORAR */}
    /* SIGNOS FUNDAMENTALES */

    /* PALABRAS RESERVADAS DE ETIQUETAS GCIC */
    {GCIC}                      {return new Symbol(GCIC, yyline+1, yycolumn+1, yytext());}
    {HEAD}                      {return new Symbol(HEAD, yyline+1, yycolumn+1, yytext());}
    {TITLE}                     {return new Symbol(TITLE, yyline+1, yycolumn+1, yytext());}
    {LINK}                      {return new Symbol(LINK, yyline+1, yycolumn+1, yytext());}
    {BODY}                      {return new Symbol(BODY, yyline+1, yycolumn+1, yytext());}
    {SPAM}                      {return new Symbol(SPAM, yyline+1, yycolumn+1, yytext());}
    {INPUT}                     {return new Symbol(INPUT, yyline+1, yycolumn+1, yytext());}
    {TEXTAREA}                  {return new Symbol(TEXTAREA, yyline+1, yycolumn+1, yytext());}
    {SELECT}                    {return new Symbol(SELECT, yyline+1, yycolumn+1, yytext());}
    {OPTION}                    {return new Symbol(OPTION, yyline+1, yycolumn+1, yytext());}
    {DIV}                       {return new Symbol(DIV, yyline+1, yycolumn+1, yytext());}
    {IMG}                       {return new Symbol(IMG, yyline+1, yycolumn+1, yytext());}
    {BR}                        {return new Symbol(BR, yyline+1, yycolumn+1, yytext());}
    {BUTTON}                    {return new Symbol(BUTTON, yyline+1, yycolumn+1, yytext());}
    {H1}                        {return new Symbol(H1, yyline+1, yycolumn+1, yytext());}
    {P}                         {return new Symbol(P, yyline+1, yycolumn+1, yytext());}
    {SCRIPTING}                 {return new Symbol(SCRIPTING, yyline+1, yycolumn+1, yytext());}

    /* PARAMETROS DE ETIQUETAS */
    {HREF}                      {return new Symbol(HREF, yyline+1, yycolumn+1, yytext());}
    {BACKGROUND}                {return new Symbol(BACKGROUND, yyline+1, yycolumn+1, yytext());}
    {COLOR}                     {return new Symbol(COLOR, yyline+1, yycolumn+1, yytext());}
    {FONTSIZE}                  {return new Symbol(FONTSIZE, yyline+1, yycolumn+1, yytext());}
    {FONTFAMILY}                {return new Symbol(FONTFAMILY, yyline+1, yycolumn+1, yytext());}
    {TEXTALIGN}                 {return new Symbol(TEXTALIGN, yyline+1, yycolumn+1, yytext());}
    {TYPE}                      {return new Symbol(TYPE, yyline+1, yycolumn+1, yytext());}
    {ID}                        {return new Symbol(ID, yyline+1, yycolumn+1, yytext());}
    {NAME}                      {return new Symbol(NAME, yyline+1, yycolumn+1, yytext());}
    {COLS}                      {return new Symbol(COLS, yyline+1, yycolumn+1, yytext());}
    {ROWS}                      {return new Symbol(ROWS, yyline+1, yycolumn+1, yytext());}
    {CLASS}                     {return new Symbol(CLASS, yyline+1, yycolumn+1, yytext());}
    {SRC}                       {return new Symbol(SRC, yyline+1, yycolumn+1, yytext());}
    {WIDTH}                     {return new Symbol(WIDTH, yyline+1, yycolumn+1, yytext());}
    {HEIGHT}                    {return new Symbol(HEIGHT, yyline+1, yycolumn+1, yytext());}
    {ALT}                       {return new Symbol(ALT, yyline+1, yycolumn+1, yytext());}
    {ONCLICK}                   {return new Symbol(ONCLICK, yyline+1, yycolumn+1, yytext());}

    /* PALABRAS DE LOS PARAMETROS */
    {BLACK}                     {return new Symbol(BLACK, yyline+1, yycolumn+1, yytext());}
    {OLIVE}                     {return new Symbol(OLIVE, yyline+1, yycolumn+1, yytext());}
    {TEAL}                      {return new Symbol(TEAL, yyline+1, yycolumn+1, yytext());}
    {RED}                       {return new Symbol(RED, yyline+1, yycolumn+1, yytext());}
    {BLUE}                      {return new Symbol(BLUE, yyline+1, yycolumn+1, yytext());}
    {MAROON}                    {return new Symbol(MAROON, yyline+1, yycolumn+1, yytext());}
    {NAVY}                      {return new Symbol(NAVY, yyline+1, yycolumn+1, yytext());}
    {GRAY}                      {return new Symbol(GRAY, yyline+1, yycolumn+1, yytext());}
    {LIME}                      {return new Symbol(LIME, yyline+1, yycolumn+1, yytext());}
    {FUCHSIA}                   {return new Symbol(FUCHSIA, yyline+1, yycolumn+1, yytext());}
    {GREEN}                     {return new Symbol(GREEN, yyline+1, yycolumn+1, yytext());}
    {WHITE}                     {return new Symbol(WHITE, yyline+1, yycolumn+1, yytext());}
    {PURPLE}                    {return new Symbol(PURPLE, yyline+1, yycolumn+1, yytext());}
    {SILVER}                    {return new Symbol(SILVER, yyline+1, yycolumn+1, yytext());}
    {YELLOW}                    {return new Symbol(YELLOW, yyline+1, yycolumn+1, yytext());}
    {AQUA}                      {return new Symbol(AQUA, yyline+1, yycolumn+1, yytext());}
    {HEXADECIMAL}               {return new Symbol(HEXADECIMAL, yyline+1, yycolumn+1, yytext());}

    {DIGITO_COM}                {return new Symbol(DIGITO_COM, yyline+1, yycolumn+1, yytext());}
    {PIXELES}                   {return new Symbol(PIXELES, yyline+1, yycolumn+1, yytext());}
    {PORCENTAJE}                {return new Symbol(PORCENTAJE, yyline+1, yycolumn+1, yytext());}

    {COURIER}                   {return new Symbol(COURIER, yyline+1, yycolumn+1, yytext());}
    {VERDANA}                   {return new Symbol(VERDANA, yyline+1, yycolumn+1, yytext());}
    {ARIAL}                     {return new Symbol(ARIAL, yyline+1, yycolumn+1, yytext());}
    {GENEVA}                    {return new Symbol(GENEVA, yyline+1, yycolumn+1, yytext());}
    {SANS_SERIF}                {return new Symbol(SANS_SERIF, yyline+1, yycolumn+1, yytext());}

    {LEFT}                      {return new Symbol(LEFT, yyline+1, yycolumn+1, yytext());}
    {RIGHT}                     {return new Symbol(RIGHT, yyline+1, yycolumn+1, yytext());}
    {CENTER}                    {return new Symbol(CENTER, yyline+1, yycolumn+1, yytext());}
    {JUSTIFY}                   {return new Symbol(JUSTIFY, yyline+1, yycolumn+1, yytext());}
    
    {TEXT}                      {return new Symbol(TEXT, yyline+1, yycolumn+1, yytext());}
    {NUMBER}                    {return new Symbol(NUMBER, yyline+1, yycolumn+1, yytext());}
    {RADIO}                     {return new Symbol(RADIO, yyline+1, yycolumn+1, yytext());}
    {CHECKBOX}                  {return new Symbol(CHECKBOX, yyline+1, yycolumn+1, yytext());}
    {ROW}                       {return new Symbol(ROW, yyline+1, yycolumn+1, yytext());}
    {COLUMN}                    {return new Symbol(COLUMN, yyline+1, yycolumn+1, yytext());}

    /* FUNCIONES ESPECIALES DE CLC */
    {ASC}                       {return new Symbol(ASC, yyline+1, yycolumn+1, yytext());}
    {DESC}                      {return new Symbol(DESC, yyline+1, yycolumn+1, yytext());}
    {LETPAR_NUM}                {return new Symbol(LETPAR_NUM, yyline+1, yycolumn+1, yytext());}
    {LETIMPAR_NUM}              {return new Symbol(LETIMPAR_NUM, yyline+1, yycolumn+1, yytext());}
    {REVERSE}                   {return new Symbol(REVERSE, yyline+1, yycolumn+1, yytext());}
    {CARACTER_ALEATORIO}        {return new Symbol(CARACTER_ALEATORIO, yyline+1, yycolumn+1, yytext());}
    {NUM_ALEATORIO}             {return new Symbol(NUM_ALEATORIO, yyline+1, yycolumn+1, yytext());}
    {ALERT_INFO}                {return new Symbol(ALERT_INFO, yyline+1, yycolumn+1, yytext());}
    {EXIT}                      {return new Symbol(EXIT, yyline+1, yycolumn+1, yytext());}
    {REDIRECT}                  {return new Symbol(REDIRECT, yyline+1, yycolumn+1, yytext());}
    {GETBYID}                   {return new Symbol(GETBYID, yyline+1, yycolumn+1, yytext());}
    {INIT}                      {return new Symbol(INIT, yyline+1, yycolumn+1, yytext());}
    {END}                       {return new Symbol(END, yyline+1, yycolumn+1, yytext());}
    {IF}                        {return new Symbol(IF, yyline+1, yycolumn+1, yytext());}
    {THEN}                      {return new Symbol(THEN, yyline+1, yycolumn+1, yytext());}
    {ELSE}                      {return new Symbol(ELSE, yyline+1, yycolumn+1, yytext());}
    {REPEAT}                    {return new Symbol(REPEAT, yyline+1, yycolumn+1, yytext());}
    {HUNTIL}                    {return new Symbol(HUNTIL, yyline+1, yycolumn+1, yytext());}
    {WHILE}                     {return new Symbol(WHILE, yyline+1, yycolumn+1, yytext());}
    {THENWHILE}                 {return new Symbol(THENWHILE, yyline+1, yycolumn+1, yytext());}
    {INSERT}                    {return new Symbol(INSERT, yyline+1, yycolumn+1, yytext());}

    /* LENGUAJE DE ALTO NIVEL EMBEBIDO */
    {ON_LOAD}                   {return new Symbol(ON_LOAD, yyline+1, yycolumn+1, yytext());}
    {PROCESS}                   {return new Symbol(PROCESS, yyline+1, yycolumn+1, yytext());}

    /* TIPOS DE DATOS */    
    {INTEGER}                   {return new Symbol(INTEGER, yyline+1, yycolumn+1, yytext());}
    {DECIMAL}                   {return new Symbol(DECIMAL, yyline+1, yycolumn+1, yytext());}
    {BOOLEAN}                   {return new Symbol(BOOLEAN, yyline+1, yycolumn+1, yytext());}
    {CHAR}                      {return new Symbol(CHAR, yyline+1, yycolumn+1, yytext());}
    {STRING}                    {return new Symbol(STRING, yyline+1, yycolumn+1, yytext());}
    {GLOBAL}                    {return new Symbol(GLOBAL, yyline+1, yycolumn+1, yytext());}

    /* DEFINICION DE TIPOS DE DATOS */
    {D_INTEGER}                 {return new Symbol(D_INTEGER, yyline+1, yycolumn+1, yytext());}
    {D_DECIMAL}                 {return new Symbol(D_DECIMAL, yyline+1, yycolumn+1, yytext());}
    {TRUE}                      {return new Symbol(TRUE, yyline+1, yycolumn+1, yytext());}
    {FALSE}                     {return new Symbol(FALSE, yyline+1, yycolumn+1, yytext());}
    {D_CHAR}                    {return new Symbol(D_CHAR, yyline+1, yycolumn+1, yytext());}
    {D_STRING}                  {return new Symbol(D_STRING, yyline+1, yycolumn+1, yytext());}

    /* CIERRE */
    {MENOR_CIERRE}              {return new Symbol(MENOR_CIERRE, yyline+1, yycolumn+1, yytext());}

    /* OPERADORES RELACIONALES */
    {IGUAL_IGUAL}               {return new Symbol(IGUAL_IGUAL, yyline+1, yycolumn+1, yytext());}
    {DIFERENTE_IGUAL}           {return new Symbol(DIFERENTE_IGUAL, yyline+1, yycolumn+1, yytext());}
    {MENOR_QUE}                 {return new Symbol(MENOR_QUE, yyline+1, yycolumn+1, yytext());}
    {MENOR_IGUAL}               {return new Symbol(MENOR_IGUAL, yyline+1, yycolumn+1, yytext());}
    {MAYOR_QUE}                 {return new Symbol(MAYOR_QUE, yyline+1, yycolumn+1, yytext());}
    {MAYOR_IGUAL}               {return new Symbol(MAYOR_IGUAL, yyline+1, yycolumn+1, yytext());}

    /* OPERADORES LOGICOS */
    {OR}                        {return new Symbol(OR, yyline+1, yycolumn+1, yytext());}
    {AND}                       {return new Symbol(AND, yyline+1, yycolumn+1, yytext());}
    {NOT}                       {return new Symbol(NOT, yyline+1, yycolumn+1, yytext());}

    /* OPERADORES ARITMETICOS */
    {SUMA}                      {return new Symbol(SUMA, yyline+1, yycolumn+1, yytext());}
    {RESTA}                     {return new Symbol(RESTA, yyline+1, yycolumn+1, yytext());}
    {MULTIPLICACION}            {return new Symbol(MULTIPLICACION, yyline+1, yycolumn+1, yytext());}
    {DIVISION}                  {return new Symbol(DIVISION, yyline+1, yycolumn+1, yytext());}

    /* COMODINES */
    {ID_ETIQUETA}               {return new Symbol(ID_ETIQUETA, yyline+1, yycolumn+1, yytext());}
    {ALLCHAR_COMSIMP}           {return new Symbol(ALLCHAR_COMSIMP, yyline+1, yycolumn+1, yytext());}
    {ALLCHARNOSPACE}            {return new Symbol(ALLCHARNOSPACE, yyline+1, yycolumn+1, yytext());}
    {ALLCHAR}                   {return new Symbol(ALLCHAR, yyline+1, yycolumn+1, yytext());}
    {ALFANUMERICO}              {return new Symbol(ALFANUMERICO, yyline+1, yycolumn+1, yytext());}
    
    /* SIMBOLOS ESPECIALES */
    {IGUAL}                     {return new Symbol(IGUAL, yyline+1, yycolumn+1, yytext());}
    {BARRA}                     {return new Symbol(BARRA, yyline+1, yycolumn+1, yytext());}
    {PARA}                      {return new Symbol(PARA, yyline+1, yycolumn+1, yytext());}
    {PARC}                      {return new Symbol(PARC, yyline+1, yycolumn+1, yytext());}
    {CORA}                      {return new Symbol(CORA, yyline+1, yycolumn+1, yytext());}
    {CORC}                      {return new Symbol(CORC, yyline+1, yycolumn+1, yytext());}
    {LLAA}                      {return new Symbol(LLAA, yyline+1, yycolumn+1, yytext());}
    {LLAC}                      {return new Symbol(LLAC, yyline+1, yycolumn+1, yytext());}
    {PUNTO_COMA}                {return new Symbol(PUNTO_COMA, yyline+1, yycolumn+1, yytext());}
    {PUNTOS}                    {return new Symbol(PUNTOS, yyline+1, yycolumn+1, yytext());}
    //{COM_SIMP}                  {return new Symbol(COM_SIMP, yyline+1, yycolumn+1, yytext());}
    {IDENTIFICADOR}             {return new Symbol(IDENTIFICADOR, yyline+1, yycolumn+1, yytext());}
    {COMA}                      {return new Symbol(COMA, yyline+1, yycolumn+1, yytext());}

    

    /* TEXTO */
    //{TEXTO}                     {return new Symbol(TEXTO, yyline+1, yycolumn+1, yytext());}

    {Ignore}                    {/* IGNORAR */}
}

//Caracteres no reconocidos por la gramática
[^] {
    System.out.println("Simbolo no reconocido: " + yytext());
}