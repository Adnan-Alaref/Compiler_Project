/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjavalexcal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author Abdo Gamal
 */

public class MyJavaLexcal {

    /**
     * @param args the command line arguments
     */
         
     public static void main(String[] args) throws FileNotFoundException {
         String jflexPath = "E:\\fourth_year\\411\\compiler\\Abdo\\project\\JflexProject\\myJavaLexcal\\src\\myjavalexcal\\Lexer.flex";
          generarLexer(jflexPath);
        
         try{
         
               JavaTokens current;
               javaScanner scanner;
         
              String inputPath = "E:\\fourth_year\\411\\compiler\\Abdo\\project\\JflexProject\\myJavaLexcal\\in.txt";
              FileReader SourseCode= new FileReader(inputPath);
              scanner=new javaScanner(SourseCode);
             
             SambolTable table=new SambolTable();
              while(true)
              {
                   current= scanner.nextToken();
                     current.setlcationAtSamobolTable(table.count);
                 table.sambolTable.put(current,table.count++);
                
                  System.out.println(" token :<"+current.toString()+">");
            
                  if(current.EndOfFile()==true)break;
              }
                 SourseCode.close();
                 table.showAll();
         
        }catch(Exception ex)
        {
        System.out.println(ex.toString());
    
        }
    
    }
         public static void generarLexer(String jflexPath)
         {
            File lexcalFile = new File(jflexPath);
            JFlex.Main.generate(lexcalFile);
         }
}
 