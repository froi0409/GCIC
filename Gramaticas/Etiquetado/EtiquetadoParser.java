
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.froi.pruebas.gramaticas;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class EtiquetadoParser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return EtiquetadoParserSym.class;
}

  /** Default constructor. */
  @Deprecated
  public EtiquetadoParser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public EtiquetadoParser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public EtiquetadoParser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\007\000\002\002\004\000\002\002\012\000\002\005" +
    "\004\000\002\003\012\000\002\004\012\000\002\006\002" +
    "\000\002\007\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\035\000\004\112\004\001\002\000\004\004\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\001\001\002" +
    "\000\004\114\010\001\002\000\004\112\012\001\002\000" +
    "\004\112\034\001\002\000\004\005\025\001\002\000\004" +
    "\112\015\001\002\000\004\112\uffff\001\002\000\004\010" +
    "\016\001\002\000\004\114\017\001\002\000\004\112\ufffb" +
    "\001\002\000\004\112\021\001\002\000\004\124\022\001" +
    "\002\000\004\010\023\001\002\000\004\114\024\001\002" +
    "\000\004\112\ufffd\001\002\000\004\114\026\001\002\000" +
    "\004\112\ufffc\001\002\000\004\112\030\001\002\000\004" +
    "\124\031\001\002\000\004\005\032\001\002\000\004\114" +
    "\033\001\002\000\004\112\ufffe\001\002\000\004\124\035" +
    "\001\002\000\004\004\036\001\002\000\004\114\037\001" +
    "\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\035\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\003\012\005\010\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\004\013\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\007\017\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\006" +
    "\026\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$EtiquetadoParser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$EtiquetadoParser$actions(this);
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
    return action_obj.CUP$EtiquetadoParser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    public EtiquetadoParser(EtiquetadoLexer lexer) {
        super(lexer);
    }
    public void report_error(String message, Object info) {
        System.out.println("reporterror");;
    }
    public void report_fatal_error(String message, Object info) {
        System.out.println("reportfatal " + info);
    }
    @Override
    public void syntax_error(Symbol s) {
        System.out.println("linea: " + s.left + "   columna: " + s.right + "   token: " + symbl_name_from_id(s.sym));
    }
    protected int error_sync_size() {
        return 1;
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$EtiquetadoParser$actions {
  private final EtiquetadoParser parser;

  /** Constructor */
  CUP$EtiquetadoParser$actions(EtiquetadoParser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$EtiquetadoParser$do_action_part00000000(
    int                        CUP$EtiquetadoParser$act_num,
    java_cup.runtime.lr_parser CUP$EtiquetadoParser$parser,
    java.util.Stack            CUP$EtiquetadoParser$stack,
    int                        CUP$EtiquetadoParser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$EtiquetadoParser$result;

      /* select the action based on the action number */
      switch (CUP$EtiquetadoParser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$EtiquetadoParser$stack.elementAt(CUP$EtiquetadoParser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$EtiquetadoParser$stack.elementAt(CUP$EtiquetadoParser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$EtiquetadoParser$stack.elementAt(CUP$EtiquetadoParser$top-1)).value;
		RESULT = start_val;
              CUP$EtiquetadoParser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$EtiquetadoParser$stack.elementAt(CUP$EtiquetadoParser$top-1)), ((java_cup.runtime.Symbol)CUP$EtiquetadoParser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$EtiquetadoParser$parser.done_parsing();
          return CUP$EtiquetadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= MENOR_QUE GCIC MAYOR_QUE cuerpo_gcic MENOR_QUE DIVISION GCIC MAYOR_QUE 
            {
              Object RESULT =null;
		System.out.println("Se ha llegado al final del reconocimiento");
              CUP$EtiquetadoParser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$EtiquetadoParser$stack.elementAt(CUP$EtiquetadoParser$top-7)), ((java_cup.runtime.Symbol)CUP$EtiquetadoParser$stack.peek()), RESULT);
            }
          return CUP$EtiquetadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // cuerpo_gcic ::= cabecera cuerpo 
            {
              Object RESULT =null;

              CUP$EtiquetadoParser$result = parser.getSymbolFactory().newSymbol("cuerpo_gcic",3, ((java_cup.runtime.Symbol)CUP$EtiquetadoParser$stack.elementAt(CUP$EtiquetadoParser$top-1)), ((java_cup.runtime.Symbol)CUP$EtiquetadoParser$stack.peek()), RESULT);
            }
          return CUP$EtiquetadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // cabecera ::= MENOR_QUE HEAD MAYOR_QUE cuerpo_cabecera MENOR_QUE DIVISION HEAD MAYOR_QUE 
            {
              Object RESULT =null;

              CUP$EtiquetadoParser$result = parser.getSymbolFactory().newSymbol("cabecera",1, ((java_cup.runtime.Symbol)CUP$EtiquetadoParser$stack.elementAt(CUP$EtiquetadoParser$top-7)), ((java_cup.runtime.Symbol)CUP$EtiquetadoParser$stack.peek()), RESULT);
            }
          return CUP$EtiquetadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // cuerpo ::= MENOR_QUE BODY MAYOR_QUE cuerpo_cuerpo MENOR_QUE DIVISION BODY MAYOR_QUE 
            {
              Object RESULT =null;

              CUP$EtiquetadoParser$result = parser.getSymbolFactory().newSymbol("cuerpo",2, ((java_cup.runtime.Symbol)CUP$EtiquetadoParser$stack.elementAt(CUP$EtiquetadoParser$top-7)), ((java_cup.runtime.Symbol)CUP$EtiquetadoParser$stack.peek()), RESULT);
            }
          return CUP$EtiquetadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // cuerpo_cabecera ::= 
            {
              Object RESULT =null;

              CUP$EtiquetadoParser$result = parser.getSymbolFactory().newSymbol("cuerpo_cabecera",4, ((java_cup.runtime.Symbol)CUP$EtiquetadoParser$stack.peek()), RESULT);
            }
          return CUP$EtiquetadoParser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // cuerpo_cuerpo ::= 
            {
              Object RESULT =null;

              CUP$EtiquetadoParser$result = parser.getSymbolFactory().newSymbol("cuerpo_cuerpo",5, ((java_cup.runtime.Symbol)CUP$EtiquetadoParser$stack.peek()), RESULT);
            }
          return CUP$EtiquetadoParser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$EtiquetadoParser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$EtiquetadoParser$do_action(
    int                        CUP$EtiquetadoParser$act_num,
    java_cup.runtime.lr_parser CUP$EtiquetadoParser$parser,
    java.util.Stack            CUP$EtiquetadoParser$stack,
    int                        CUP$EtiquetadoParser$top)
    throws java.lang.Exception
    {
              return CUP$EtiquetadoParser$do_action_part00000000(
                               CUP$EtiquetadoParser$act_num,
                               CUP$EtiquetadoParser$parser,
                               CUP$EtiquetadoParser$stack,
                               CUP$EtiquetadoParser$top);
    }
}

}