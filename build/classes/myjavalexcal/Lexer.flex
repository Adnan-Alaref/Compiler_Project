package myjavalexcal;
import static myjavalexcal.JavaTokens.*;
import java.util.Hashtable;
import java.util.*;
%%
%function nextToken
%class javaScanner
%type JavaTokens

%{
	//Map map=new HashMap();  

%}


InputChar = [^\n\r]  
SpaceChar = [\ \t]
LineChar = \n|\r|\r\n
Zero = 0
DecInt = [1-9][0-9]*
OctalInt = 0[0-7]+
HexInt = 0[xX][0-9a-fA-F]+
Integer = ( {Zero} | {DecInt} | {OctalInt} | {HexInt} )[lL]?
Exponent = [eE] [\+\-]? [0-9]+
Float1 = [0-9]+ \. [0-9]+ {Exponent}?
Float2 = \. [0-9]+ {Exponent}?
Float3 = [0-9]+ \. {Exponent}?
Float4 = [0-9]+ {Exponent}
Float = ( {Float1} | {Float2} | {Float3} | {Float4} ) [fFdD]? |[0-9]+ [fFDd]
Ident = [A-Za-z_$] [A-Za-z_$0-9]*
CChar = [^\'\\\n\r] | {EscChar}
SChar = [^\"\\\n\r] | {EscChar}
EscChar = \\[ntbrf\\\'\"] | {OctalEscape}
OctalEscape = \\[0-7] | \\[0-7][0-7] | \\[0-3][0-7][0-7]

keyword= abstract| continue| for| new |switch|
assert |default| if| package| synchronized|
boolean| do |goto| private| this|
break |double| implements| protected| throw|
byte |else |import| public| throws|
case |enum |instanceof| return| transient|
catch |extends| int |short |try|
char |final| interface| static |void|
class |finally| long |strictfp |volatile|
const| float| native| super |while|main|String|throws |FileNotFoundException |
Exception|out|println|File


%%
"(" {            return  new JavaTokens(TokenKind.LEFT,"nothing","(");}
")" {                  return new JavaTokens(TokenKind.RIGHT,"nothing",")");}
"{" {                  return new JavaTokens(TokenKind.LEFTCURLY,"nothing","{");}
"}" {                  return  new JavaTokens(TokenKind.RIGHTCURLY,"nothing","}");}
"[" {                  return  new JavaTokens(TokenKind.LEFTSQ,"nothing","["); }
"]" {                  return  new JavaTokens(TokenKind.RIGHTSQ,"nothing","]"); }

";" {                  return  new JavaTokens(TokenKind.sym_Suma,"nothing",";"); }
"=" {                  return  new JavaTokens(TokenKind.Equal,"nothing","="); }
"<" {                  return  new JavaTokens(TokenKind.graterthan,"nothing","<"); }
">" {                  return  new JavaTokens(TokenKind.smallthan,"nothing",">"); }


…
"&" {                  return  new JavaTokens(TokenKind.AMPERSAND,"nothing","&");}
"!" {                  return  new JavaTokens(TokenKind.Defaut,"nothing","!"); }
"~" {                  return  new JavaTokens(TokenKind.TILDE,"nothing","~"); }
true {                 return  new JavaTokens(TokenKind.BOOLEANLIT,"nothing","true"); }
false {                return  new JavaTokens(TokenKind.BOOLEANLIT,"nothing","flase");}
null {                 return  new JavaTokens(TokenKind.NULLLIT,"nothing","null"); }
{Integer} {            return  new JavaTokens(TokenKind.INTEGERLIT,"nothing",yytext()); }
{Float} {              return  new JavaTokens(TokenKind.FLOATLIT,"nothing",yytext() );}
\'{CChar}\' {          return  new JavaTokens(TokenKind.CHARLIT);}
\"{SChar}*\" {         return  new JavaTokens(TokenKind.STRINGLIT);}
{keyword} {return  new JavaTokens(TokenKind.Keyword,"nothing",yytext());}
{Ident} {              return  new JavaTokens(TokenKind.IDENT,"nothing",yytext()); }

"//"{InputChar}* {                                                }
"/*"~"*/"        {                                                }
{LineChar}       {                                                 }
{SpaceChar}      {                                                  }
<<EOF>>            {              return  new JavaTokens(TokenKind.EndFile);}
.                   {        return  new JavaTokens(TokenKind.Unknown); }








