/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjavalexcal;

/**
 *
 * @author Charly Ponce
 */

public class JavaTokens{
    
     public  JavaTokens( ){kind= TokenKind.Unknown;}
     public  JavaTokens(TokenKind k){kind=k;}
     public  JavaTokens(TokenKind k,String v ){kind=k;value=v;}
     public  JavaTokens(TokenKind k,String v, String s){kind=k;value=v;splling=s;}
     
 
     public    void setlcationAtSamobolTable(int locat){ this.lcationAtSamobolTable=locat; }
     public   String  toString(){return new String(" Kind :"+this.kind+" value :"+this.value+" spling :"+
     this.splling+" lcationInST :"+this.lcationAtSamobolTable);}
     public    boolean EndOfFile(){   if(this.kind==TokenKind.EndFile)   return true;else return false; }
     
public TokenKind kind;
public int lcationAtSamobolTable;   //for num only
public String value;   //for num only
public String splling;//for id

public enum TokenKind {
    RW_if, RW_else, RW_elseIF,   RW_for, RW_while,
     sym_assuune,  sym_eq,sym_Division,sym_Multiplicacion, sym_sum, sym_sub,sym_Suma,
    Resta,Identificador,Numero,
    Keyword
    ,Comparsion,smallthan,graterthan,
    
    
    ERROR,Defaut, End,Unknown,EndFile,
    ABSTRACT ,BOOLEAN,BREAK,TRANSIENT,TRY,VOID,VOLATILE,WHILE, BOOLEANLIT,NULLLIT,INTEGERLIT,
    FLOATLIT,CHARLIT,STRINGLIT,IDENT,
    
    Abstract ,Continue, For, New, Switch,Equal,
Assert ,Default ,If, Sackage ,Synchronized,
Boolean ,Do, Goto ,Private, This,
Break ,Double, Implements ,Protected, Throw,
Byte ,Else ,Import ,Public, Throws,
Case ,Enum ,Instanceof, Return ,Transient,
Catch ,Extends, Ent ,Short, Try,
Char ,Final ,Interface ,Static, Void,
Class ,Finally ,Long ,Strictfp ,Volatile,
Const ,Float ,Native ,Super ,While,LEFT,RIGHT,LEFTCURLY,RIGHTCURLY,LEFTSQ,RIGHTSQ,TILDE,AMPERSAND
}
}


/*
"(" { return token( sym.LEFT ); }
")" { return token( sym.RIGHT ); }
"{" { return token( sym.LEFTCURLY ); }
"}" { return token( sym.RIGHTCURLY ); }
"[" { return token( sym.LEFTSQ ); }
"]" { return token( sym.RIGHTSQ ); }
…
"&" { return token( sym.AMPERSAND ); }
"!" { return token( sym.EXCLAIM ); }
"~" { return token( sym.TILDE ); }
true { return token( sym.BOOLEANLIT ); }
false { return token( sym.BOOLEANLIT ); }
null { return token( sym.NULLLIT ); }
{Integer} { return token( sym.INTEGERLIT ); }
{Float} { return token( sym.FLOATLIT ); }
*/