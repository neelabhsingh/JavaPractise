/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;

/**
 *
 * @author Neelabh
 */
import java.util.*;
public class TestComparator {
    public static void main(String [] args){
        HashMap<String, Double> map=new HashMap<String, Double>();
        map.put("A",99.5);
        map.put("B",67.4);
        map.put("C",67.2);
        map.put("D",67.3);
        System.out.println("Unsored map:"+map);
        ValueComparator bvc=new ValueComparator(map);
        TreeMap<String, Double> sortedMap=new TreeMap<String, Double>(bvc);
        sortedMap.putAll(map);
        System.out.println("Sorted map basis of value"+sortedMap);
    }
}
class ValueComparator implements Comparator<String>{
    Map<String, Double> base;
    public ValueComparator(Map<String, Double> base){
        this.base=base;
    }
    @Override
    public int compare(String o1, String o2) {
        if(base.get(o2)>=base.get(o1)){
            return -1;
        }
        else
            return 1;
    }    
}