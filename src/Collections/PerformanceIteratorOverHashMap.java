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
public class PerformanceIteratorOverHashMap {
    public static void main(String [] args){
        HashMap<String, Integer> testMap=new HashMap<String, Integer>();
        for(int i=0;i<1000000;i++){
            testMap.put("key"+i, i);
        }
        long startTime1=Calendar.getInstance().getTimeInMillis();
        for(Map.Entry<String,Integer> entry:testMap.entrySet()){
            entry.getKey();
            entry.getValue();
        }
        long endTime1=Calendar.getInstance().getTimeInMillis();
        System.out.println("Using entrySet() in for Loop :"+(endTime1-startTime1));
        long startTime2=Calendar.getInstance().getTimeInMillis();
        for(String key: testMap.keySet()){
            testMap.get(key);
        }
        long endTime2=Calendar.getInstance().getTimeInMillis();
        System.out.println("Using keySet in for loop: "+(endTime2-startTime2));
        long startTime3=Calendar.getInstance().getTimeInMillis();
        Iterator<Map.Entry<String, Integer>> itr1=testMap.entrySet().iterator();
        while(itr1.hasNext()){
            Map.Entry<String,Integer> entry=itr1.next();
            entry.getKey();
            entry.getValue();
        }
        long endTime3=Calendar.getInstance().getTimeInMillis();
        System.out.println("Using entrySet() and Iterator: "+(endTime3-startTime3));
        
        long startTime4=Calendar.getInstance().getTimeInMillis();
        Iterator<String> itr2=testMap.keySet().iterator();
        while(itr2.hasNext()){
            String key=itr2.next();
            testMap.get(key);
        }
        long endTime4=Calendar.getInstance().getTimeInMillis();
        System.out.println("Using keySet() and Iterator: "+(endTime4-startTime4));
    }
    
}
