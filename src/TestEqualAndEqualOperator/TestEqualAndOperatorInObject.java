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
public class TestEqualAndOperatorInObject {
    public static void main(String [] args){
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=e2;
        System.out.println("e1.equals(e2)="+e1.equals(e2));
        System.out.println("e1==e2="+(e1==e2));
        System.out.println("e3.equals(e2)="+e3.equals(e2));
        System.out.println("e3==e2="+(e3==e2));
    }
}
class Employee{
    
}