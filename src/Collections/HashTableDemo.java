/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

/**
 *
 * @author Neelabh
 */
import java.util.*;
public class HashTableDemo {
    public static void main(String args[]){
        Hashtable htable1=new Hashtable();
        htable1.put(1, "A");
        htable1.put(2, "B");
        htable1.put(3, "C");
        htable1.put(4, "D");
        Enumeration en=htable1.elements();
        while(en.hasMoreElements()){
           
            System.out.println(en.nextElement());
        }
    }
}
