/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author Neelabh
 */
import java.util.*;
public class TestListIterator {
    public static void main(String [] args){
        List<String> aList=new ArrayList<String>();
        aList.add("1");
        aList.add("2");
        aList.add("3");
        aList.add("4");
        ListIterator listIterator=aList.listIterator();
        while(listIterator.hasNext()){
            System.out.print(listIterator.next());
        }
       
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous());
        }
    }
}
