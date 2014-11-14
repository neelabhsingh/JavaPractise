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
public class TreeSetTest {
    public static void main(String [] args){
        TreeSet ts=new TreeSet();
        SortedSet set=new TreeSet();
        ts.add(null);
        ts.add("A");
        ts.add("B");
        //ts.add(1); It lead java.lang.ClassCastException:
        //ts.add(null); NullPointerException
        ts.add("C");
        System.out.println(ts);
    }
}
