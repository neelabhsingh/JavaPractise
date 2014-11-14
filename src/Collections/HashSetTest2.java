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
public class HashSetTest2 {
    public static void main(String [] args){
       HashSet hs=new HashSet(); 
       hs.add("B");
       hs.add("A");
       hs.add("D");
       hs.add("E");
       hs.add("F");
       hs.add(null);// HashSet permits null value.
       System.out.println(hs);
       hs.remove("K");
    }    
}
