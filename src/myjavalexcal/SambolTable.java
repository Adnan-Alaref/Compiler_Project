/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myjavalexcal;


import java.io.File;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * @author Abdo Gamal
 */
public class SambolTable {
    
    public   Hashtable<JavaTokens, Integer>  sambolTable;
    public      int count;
         
         public SambolTable(){
         count=1;
         sambolTable =  new Hashtable<JavaTokens, Integer>();
       
        }
    public void  showAll(){
        
     for( Iterator iter=sambolTable.keySet().iterator(); iter.hasNext(); ) {
      JavaTokens key = (JavaTokens) iter.next();
      int value = (int) sambolTable.get( key );
     System.out.println(key.kind);
      }

    }
}
