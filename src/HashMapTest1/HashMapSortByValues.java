/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HashMapTest1;

/**
 *
 * @author Neelabh
 */
import java.util.*;
public class HashMapSortByValues {
   public static void main(String [] args){
       HashMap<Integer,String> hmap=new HashMap<Integer,String>();
       hmap.put(1, "A");
       hmap.put(11, "C");
       hmap.put(4, "Z");
       hmap.put(77, "Y");
       hmap.put(9, "P");
       hmap.put(66, "Q");
       hmap.put(0, "R");
       System.out.println("Before Sorting");
       Set set=hmap.entrySet();
       Iterator itr=set.iterator();
       while(itr.hasNext()){
           Map.Entry me=(Map.Entry<Integer, String>)itr.next();
           System.out.println(me.getKey()+":"+me.getValue());
       }
       Map<Integer,String> map=sortByValues(hmap);
       System.out.println("After sorting");
       Set sortedSet=map.entrySet();
       Iterator itr1=sortedSet.iterator();
       while(itr1.hasNext()){
           Map.Entry me=(Map.Entry)itr1.next();
           System.out.println(me.getKey()+":"+me.getValue());           
       }
   } 

    private static Map<Integer, String> sortByValues(HashMap<Integer, String> hmap) {
        List list=new LinkedList(hmap.entrySet());
        Collections.sort(list,new Comparator(){
            public int compare(Object obj1, Object obj2){
                return ((Comparable)((Map.Entry)(obj1)).getValue()).compareTo(((Map.Entry)(obj2)).getValue());
                
            }
        });
        Map soretedHashMap=new LinkedHashMap();
        for(Iterator itr1=list.iterator();itr1.hasNext();){
            Map.Entry entry=(Map.Entry)itr1.next();
            soretedHashMap.put(entry.getKey(), entry.getValue());
        }
        return soretedHashMap;
    }
}
