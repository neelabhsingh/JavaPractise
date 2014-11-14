/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enumerator;

/**
 *
 * @author Neelabh
 */
import java.util.*;
public class TestEnumerator {
    public static void main(String [] args){
        Vector <String> lang=new Vector<String>();
        Enumeration<String> en=null;
        lang.add("Java");
        lang.add("JSP");
        lang.add("EJB");
        lang.add("PHP");
        int i=0;
        en=lang.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
            if(i==0)// If there is Iterator then will Fast fail.
                lang.remove("java");
        }
    }
    
}
