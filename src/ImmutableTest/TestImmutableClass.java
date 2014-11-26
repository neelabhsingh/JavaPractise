/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImmutableTest;

import java.util.Date;

/**
 *
 * @author Neelabh
 */
public class TestImmutableClass {
    public static void main(String [] args){
        ImmutableClass imClass =ImmutableClass.createNewInstacne(100,"test", new Date());
        System.out.println(imClass);
        tryModification(imClass.getImmutableField1(),imClass.getImmutableField2(),imClass.getMutableField());
        System.out.println(imClass);
    }
    private static void tryModification(Integer immutableField1, String immutableField2, Date mutableField){
        immutableField1=1000;
        immutableField2="test changed";
        mutableField.setDate(14); 
    }
}
