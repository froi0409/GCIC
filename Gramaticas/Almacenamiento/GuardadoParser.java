
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.froi.gcic.gramaticas.almacenamiento;

import com.froi.gcic.entidades.Captcha;
import com.froi.gcic.entidades.Parametro;
import java.util.ArrayList;
import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class GuardadoParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return GuardadoParserSym.class;
}

  /** Default constructor. */
  @Deprecated
  public GuardadoParser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public GuardadoParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public GuardadoParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\034\000\002\002\004\000\002\002\006\000\002\003" +
    "\005\000\002\003\003\000\002\003\002\000\002\004\005" +
    "\000\002\005\005\000\002\005\003\000\002\005\005\000" +
    "\002\006\005\000\002\006\005\000\002\006\005\000\002" +
    "\006\005\000\002\006\005\000\002\006\005\000\002\006" +
    "\005\000\002\006\005\000\002\006\005\000\002\007\003" +
    "\000\002\007\003\000\002\007\003\000\002\007\003\000" +
    "\002\007\003\000\002\007\003\000\002\007\003\000\002" +
    "\007\003\000\002\007\003\000\002\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\066\000\004\004\004\001\002\000\004\016\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\010\017\ufffd\020\011\022\ufffd\001\002\000\006\017" +
    "\067\022\066\001\002\000\024\005\016\006\022\007\020" +
    "\010\023\011\017\012\021\013\014\014\024\015\015\001" +
    "\002\000\006\017\ufffe\022\ufffe\001\002\000\006\021\ufffa" +
    "\022\ufffa\001\002\000\004\023\064\001\002\000\004\023" +
    "\062\001\002\000\004\023\060\001\002\000\004\023\056" +
    "\001\002\000\004\023\054\001\002\000\004\023\052\001" +
    "\002\000\004\023\050\001\002\000\004\023\046\001\002" +
    "\000\004\023\032\001\002\000\006\021\027\022\026\001" +
    "\002\000\026\003\031\005\016\006\022\007\020\010\023" +
    "\011\017\012\021\013\014\014\024\015\015\001\002\000" +
    "\006\017\ufffc\022\ufffc\001\002\000\006\021\ufffb\022\ufffb" +
    "\001\002\000\006\021\ufff9\022\ufff9\001\002\000\026\005" +
    "\037\006\043\007\040\010\044\011\036\012\042\013\033" +
    "\014\045\015\035\024\041\001\002\000\006\021\uffe8\022" +
    "\uffe8\001\002\000\006\021\ufff1\022\ufff1\001\002\000\006" +
    "\021\uffe6\022\uffe6\001\002\000\006\021\uffea\022\uffea\001" +
    "\002\000\006\021\uffee\022\uffee\001\002\000\006\021\uffec" +
    "\022\uffec\001\002\000\006\021\uffef\022\uffef\001\002\000" +
    "\006\021\uffe9\022\uffe9\001\002\000\006\021\uffed\022\uffed" +
    "\001\002\000\006\021\uffeb\022\uffeb\001\002\000\006\021" +
    "\uffe7\022\uffe7\001\002\000\026\005\037\006\043\007\040" +
    "\010\044\011\036\012\042\013\033\014\045\015\035\024" +
    "\041\001\002\000\006\021\ufff5\022\ufff5\001\002\000\026" +
    "\005\037\006\043\007\040\010\044\011\036\012\042\013" +
    "\033\014\045\015\035\024\041\001\002\000\006\021\ufff7" +
    "\022\ufff7\001\002\000\026\005\037\006\043\007\040\010" +
    "\044\011\036\012\042\013\033\014\045\015\035\024\041" +
    "\001\002\000\006\021\ufff3\022\ufff3\001\002\000\026\005" +
    "\037\006\043\007\040\010\044\011\036\012\042\013\033" +
    "\014\045\015\035\024\041\001\002\000\006\021\ufff6\022" +
    "\ufff6\001\002\000\026\005\037\006\043\007\040\010\044" +
    "\011\036\012\042\013\033\014\045\015\035\024\041\001" +
    "\002\000\006\021\ufff4\022\ufff4\001\002\000\026\005\037" +
    "\006\043\007\040\010\044\011\036\012\042\013\033\014" +
    "\045\015\035\024\041\001\002\000\006\021\ufff8\022\ufff8" +
    "\001\002\000\026\005\037\006\043\007\040\010\044\011" +
    "\036\012\042\013\033\014\045\015\035\024\041\001\002" +
    "\000\006\021\ufff0\022\ufff0\001\002\000\026\005\037\006" +
    "\043\007\040\010\044\011\036\012\042\013\033\014\045" +
    "\015\035\024\041\001\002\000\006\021\ufff2\022\ufff2\001" +
    "\002\000\004\020\011\001\002\000\004\002\000\001\002" +
    "\000\006\017\uffff\022\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\066\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\003\007\004\011" +
    "\001\001\000\002\001\001\000\006\005\024\006\012\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\006" +
    "\027\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\007\033\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\007\046\001\001\000\002\001\001\000\004\007" +
    "\050\001\001\000\002\001\001\000\004\007\052\001\001" +
    "\000\002\001\001\000\004\007\054\001\001\000\002\001" +
    "\001\000\004\007\056\001\001\000\002\001\001\000\004" +
    "\007\060\001\001\000\002\001\001\000\004\007\062\001" +
    "\001\000\002\001\001\000\004\007\064\001\001\000\002" +
    "\001\001\000\004\004\067\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$GuardadoParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$GuardadoParser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$GuardadoParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    private ArrayList<Captcha> listaCaptchas;

    public GuardadoParser(GuardadoLexer lexer, ArrayList<Captcha> listaCaptchas) {
        super(lexer);
        this.listaCaptchas = listaCaptchas;
    }
    public void report_error(String message, Object info) {
        System.out.println("reporterror");
    }
    public void report_fatal_error(String message, Object info) {
        System.out.println("reportfatal");
    }
    public void syntax_error(Symbol cur_token) {
        System.out.println("syntaxerr " + symbl_name_from_id(cur_token.sym) + " " + cur_token.left + " - " + cur_token.right);
    }
    protected int error_sync_size() {
        return 1;
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$GuardadoParser$actions {
  private final GuardadoParser parser;

  /** Constructor */
  CUP$GuardadoParser$actions(GuardadoParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$GuardadoParser$do_action_part00000000(
    int                        CUP$GuardadoParser$act_num,
    java_cup.runtime.lr_parser CUP$GuardadoParser$parser,
    java.util.Stack            CUP$GuardadoParser$stack,
    int                        CUP$GuardadoParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$GuardadoParser$result;

      /* select the action based on the action number */
      switch (CUP$GuardadoParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-1)).value;
		RESULT = start_val;
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-1)), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$GuardadoParser$parser.done_parsing();
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= DBCAPTCHAS PARA cuerpo_captchas PARC 
            {
              Object RESULT =null;

              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-3)), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // cuerpo_captchas ::= cuerpo_captchas COMA captcha_detectado 
            {
              Object RESULT =null;

              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("cuerpo_captchas",1, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-2)), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // cuerpo_captchas ::= captcha_detectado 
            {
              Object RESULT =null;

              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("cuerpo_captchas",1, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // cuerpo_captchas ::= 
            {
              Object RESULT =null;

              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("cuerpo_captchas",1, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // captcha_detectado ::= LLAA parametros_captcha LLAC 
            {
              Object RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-1)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-1)).right;
		ArrayList<Parametro> l = (ArrayList<Parametro>)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-1)).value;
		
                            Captcha nuevoCaptcha = new Captcha();
                            for(Parametro element: l) {
                                switch(element.getNombre()) {
                                    case "id":
                                        nuevoCaptcha.setId(element.getValor());
                                        break;
                                    case "name":
                                        nuevoCaptcha.setName(element.getValor());
                                        break;
                                    case "link":
                                        nuevoCaptcha.setLink(element.getValor());
                                        break;
                                    case "path":
                                        nuevoCaptcha.setPath(element.getValor());
                                        break;
                                    case "cantusos":
                                        nuevoCaptcha.setCantidadUsos(Integer.parseInt(element.getValor()));
                                        break;
                                    case "aciertos":
                                        nuevoCaptcha.setAciertos(Integer.parseInt(element.getValor()));
                                        break;
                                    case "fallos":
                                        nuevoCaptcha.setFallos(Integer.parseInt(element.getValor()));
                                        break;
                                    case "datelastuso":
                                        nuevoCaptcha.setFecha(element.getValor());
                                        break;
                                    case "linkredirect":
                                        nuevoCaptcha.setLinkRedirect(element.getValor());
                                        break;
                                }
                            }
                            listaCaptchas.add(nuevoCaptcha);
                        
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("captcha_detectado",2, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-2)), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // parametros_captcha ::= parametros_captcha COMA parametros_captcha_p 
            {
              ArrayList<Parametro> RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-2)).right;
		ArrayList<Parametro> l = (ArrayList<Parametro>)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		Parametro p = (Parametro)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		l.add(p); RESULT = l;
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("parametros_captcha",3, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-2)), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // parametros_captcha ::= parametros_captcha_p 
            {
              ArrayList<Parametro> RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		Parametro p = (Parametro)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		ArrayList<Parametro> l = new ArrayList<>(); l.add(p); RESULT = l;
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("parametros_captcha",3, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // parametros_captcha ::= parametros_captcha COMA error 
            {
              ArrayList<Parametro> RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-2)).right;
		ArrayList<Parametro> l = (ArrayList<Parametro>)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-2)).value;
		RESULT = l;
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("parametros_captcha",3, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-2)), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // parametros_captcha_p ::= ID PUNTOS all_strings 
            {
              Parametro RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		RESULT = new Parametro("id", val.toString().replace("\"", ""));
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("parametros_captcha_p",4, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-2)), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // parametros_captcha_p ::= NOMBRE PUNTOS all_strings 
            {
              Parametro RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		RESULT = new Parametro("name", val.toString().replace("\"", ""));
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("parametros_captcha_p",4, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-2)), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // parametros_captcha_p ::= LINK PUNTOS all_strings 
            {
              Parametro RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		RESULT = new Parametro("link", val.toString().replace("\"", ""));
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("parametros_captcha_p",4, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-2)), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // parametros_captcha_p ::= PATH PUNTOS all_strings 
            {
              Parametro RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		RESULT = new Parametro("path", val.toString().replace("\"", ""));
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("parametros_captcha_p",4, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-2)), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // parametros_captcha_p ::= CANTUSOS PUNTOS all_strings 
            {
              Parametro RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		RESULT = new Parametro("cantusos", val.toString().replace("\"", ""));
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("parametros_captcha_p",4, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-2)), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // parametros_captcha_p ::= ACIERTOS PUNTOS all_strings 
            {
              Parametro RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		RESULT = new Parametro("aciertos", val.toString().replace("\"", ""));
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("parametros_captcha_p",4, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-2)), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // parametros_captcha_p ::= FALLOS PUNTOS all_strings 
            {
              Parametro RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		RESULT = new Parametro("fallos", val.toString().replace("\"", ""));
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("parametros_captcha_p",4, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-2)), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // parametros_captcha_p ::= DATELASTUSO PUNTOS all_strings 
            {
              Parametro RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		RESULT = new Parametro("datelastuso", val.toString().replace("\"", ""));
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("parametros_captcha_p",4, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-2)), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // parametros_captcha_p ::= LINKREDIRECT PUNTOS all_strings 
            {
              Parametro RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		RESULT = new Parametro("linkredirect", val.toString().replace("\"", ""));
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("parametros_captcha_p",4, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.elementAt(CUP$GuardadoParser$top-2)), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // all_strings ::= ALLCHAR 
            {
              String RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		RESULT=val.toString();
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("all_strings",5, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // all_strings ::= ID 
            {
              String RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		RESULT=val.toString();
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("all_strings",5, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // all_strings ::= NOMBRE 
            {
              String RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		RESULT=val.toString();
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("all_strings",5, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // all_strings ::= LINK 
            {
              String RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		RESULT=val.toString();
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("all_strings",5, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // all_strings ::= PATH 
            {
              String RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		RESULT=val.toString();
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("all_strings",5, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // all_strings ::= CANTUSOS 
            {
              String RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		RESULT=val.toString();
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("all_strings",5, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // all_strings ::= ACIERTOS 
            {
              String RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		RESULT=val.toString();
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("all_strings",5, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // all_strings ::= FALLOS 
            {
              String RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		RESULT=val.toString();
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("all_strings",5, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // all_strings ::= DATELASTUSO 
            {
              String RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		RESULT=val.toString();
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("all_strings",5, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // all_strings ::= LINKREDIRECT 
            {
              String RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$GuardadoParser$stack.peek()).value;
		RESULT=val.toString();
              CUP$GuardadoParser$result = parser.getSymbolFactory().newSymbol("all_strings",5, ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), ((java_cup.runtime.Symbol)CUP$GuardadoParser$stack.peek()), RESULT);
            }
          return CUP$GuardadoParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$GuardadoParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$GuardadoParser$do_action(
    int                        CUP$GuardadoParser$act_num,
    java_cup.runtime.lr_parser CUP$GuardadoParser$parser,
    java.util.Stack            CUP$GuardadoParser$stack,
    int                        CUP$GuardadoParser$top)
    throws java.lang.Exception
    {
              return CUP$GuardadoParser$do_action_part00000000(
                               CUP$GuardadoParser$act_num,
                               CUP$GuardadoParser$parser,
                               CUP$GuardadoParser$stack,
                               CUP$GuardadoParser$top);
    }
}

}
