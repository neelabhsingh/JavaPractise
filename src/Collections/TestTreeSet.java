/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.*;

/**
 *
 * @author Neelabh
 */
public class TestTreeSet {
    public static void main(String [] args){
        SortedSet set=   new TreeSet();   
        set.add("A");
        set.add("C");
        //set.add(1);  java.lang.ClassCastException:
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }    
}
