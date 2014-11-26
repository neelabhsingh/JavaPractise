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
public class TestSortedSet {
    public static void main(String [] args){
        SortedSet<String> set=new TreeSet<String>();
        set.add("D");
        set.add("B");
        set.add("C");
        Iterator itr=set.iterator();
        while(itr.hasNext())
            System.out.print(itr.next()+" ");
    }
}
