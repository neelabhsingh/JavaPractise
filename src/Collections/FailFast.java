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
public class FailFast {
    public static void main(String [] args){
        List<String> strings=new Vector<String>();
        strings.add("lorem");
        strings.add("ipsum");
        strings.add("sit");
        Iterator<String> itr=strings.iterator();
        int i=0;
        while(itr.hasNext()){
            System.out.println(itr.next());
            if(i++==0)
                strings.remove(0);
        }
    }    
}
