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
public class DiffBetHashMapAndHashTable {
    public static void main(String [] args){
        HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
        hashMap.put("key"+1, 1);
        hashMap.put("key"+2, 2);
        hashMap.put(null, null);
        hashMap.put(null,3);
        hashMap.put("Key"+4,null);
        Set entry=hashMap.entrySet();
        Iterator itr=entry.iterator();        
        int count=0;
        while(itr.hasNext()){
            count++;
            // if(count==2)
            //hashMap.remove("key2");
            //hashMap.put("Key"+6, 3);
            /*   Exception in thread "main" java.util.ConcurrentModificationException. This called Iterator in 
            the HashMap is a fail-fast iterator 
            */
            
            Map.Entry me=(Map.Entry<String,Integer>)itr.next();
            System.out.println(me.getKey()+" "+me.getValue());    
        }
    }
}
