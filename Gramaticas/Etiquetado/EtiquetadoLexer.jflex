//Sección de Importaciones

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
H1 = [cC][_][hH][]
P = [cC][_][pP]


%%

<YYINITIAL> {



}

//Caracteres no reconocidos por la gramática
[^] {

}