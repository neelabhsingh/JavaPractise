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
public class SetTest {
    public static void main(String [] args){
        int [] count={34,22,10,60,30,22};
        Set<Integer> set=new HashSet<Integer>();
        try{
            for(int i=0;i<5;i++){
                set.add(count[i]);
                
            }
            TreeSet sortedSet=new TreeSet<Integer>(set);
            System.out.println(sortedSet);
            System.out.println("The first element is of set is "+(Integer)sortedSet.first());
            System.out.println("The last element of set is "+(Integer)sortedSet.last());
        }
        catch(Exception E){
            
        }
    }
    
}
