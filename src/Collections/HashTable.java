/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.Hashtable;

/**
 *
 * @author Neelabh
 */
public class HashTable {
    public static void main(String [] args){
        Hashtable<Integer, String> cityTable=new Hashtable<Integer, String>();
        cityTable.put(1,"Lahore");
        cityTable.put(1,"Karachi");
       // cityTable.put(2, null);// Run time error
        //cityTable.put(null,"Allahabad"); //Run time error
        cityTable.put(null, null); // run time error
    }
    
}
