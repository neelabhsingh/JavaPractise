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
public class SynchronizedMap {
    public static void main(String []args){
        Map<String,String> map=new HashMap<String,String>();
        map.put("1","CSE");
        map.put("2","EC");
        map.put("3","IT");
        Map<String,String> synmap=Collections.synchronizedMap(map);
        System.out.println("Synchronized Map"+synmap);
    }
}
