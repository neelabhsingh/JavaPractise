/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionAlgorithm;

/**
 *
 * @author Neelabh
 */
import java.util.*;
public class ReverseSort {
    public static void main(String [] args){
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(new Integer(8));
        ll.add(new Integer(20));
        ll.add(new Integer(-20));
        ll.add(new Integer(21));
        ll.add(new Integer(30));
        Comparator r=Collections.reverseOrder();
        Collections.sort(ll,r);
        Iterator itr=ll.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
