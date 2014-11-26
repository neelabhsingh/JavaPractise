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
import java.util.LinkedHashMap;
import java.util.*;
//import java.util.*; gives error in for LinkedHashMap
public class LinkedHashMapDemo {
    public static void main(String [] args){       
       LinkedHashMap<String, Integer> lhm=new LinkedHashMap<String, Integer>(); 
       lhm.put("A", 1);
       lhm.put("B",2);
       lhm.put("C",3);
       lhm.put("D",4);
       Set entry=lhm.entrySet();
       Iterator itr=entry.iterator();
       while(itr.hasNext()){
           Map.Entry me=(Map.Entry<String, Integer>)itr.next();
           System.out.print(me.getKey()+" "+me.getValue()+",");
       }
       System.out.println();
       //Using for loop
       for(Map.Entry<String,Integer> entry1:lhm.entrySet()){
           System.out.print(entry1.getKey()+" "+entry1.getValue()+",");
       }
    }
}
