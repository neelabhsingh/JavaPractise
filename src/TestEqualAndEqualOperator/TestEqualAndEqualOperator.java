/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestEqualAndEqualOperator;

/**
 *
 * @author Neelabh
 */
public class TestEqualAndEqualOperator {
    public static void main(String [] args){
        String obj1=new String("xyz");
        String obj2=new String("xyz");
        if(obj1.equals(obj2))
            System.out.println("Both are equal inrespect to equal method");
        else
            System.out.println("Both are not equal inrespect to equal method");
        if(obj1==obj2)
            System.out.println("Both are equal in respect to equal operator");
        else
            System.out.println("Both are not equal in respect to equal operator");
    }
}
