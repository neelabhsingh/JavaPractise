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
public class SetTest1 {
    public static void main(String [] args){
        Set set=new HashSet ();
        set.add("d");
        set.add(1);// No Runtime Exception If there is Tree set then it will give java.lang.ClassCastException:
        System.out.println(set);
    }
}
