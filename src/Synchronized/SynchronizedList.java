/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Synchronized;

/**
 *
 * @author Neelabh
 */
import java.util.*;
public class SynchronizedList {
    public static void main(String [] args){
        List<String> ll=new ArrayList<String>();
        List<String> sysLi=Collections.synchronizedList(ll);
    }
}
