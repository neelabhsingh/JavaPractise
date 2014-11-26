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
public class TestHashMap {
    public static void main(String [] args){
        HashMap<String, Double> hashMap=new HashMap<String, Double>();
        hashMap.put("A",12.3);
        hashMap.put("B",12.4);
        hashMap.put("C",10.4);
        hashMap.put("D", 9.04);
        Set set=hashMap.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry me=(Map.Entry<String, Double>)itr.next();
            System.out.print(me.getKey()+" ");
            System.out.println(me.getValue());
        }
    }
}
