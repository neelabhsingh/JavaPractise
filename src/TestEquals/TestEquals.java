/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestEquals;

/**
 *
 * @author Neelabh
 */
public class TestEquals {
    public static void main(String [] args){
         Integer i1=new Integer(1);  
         Integer i2=new Integer(2);
         
         System.out.println(i1.equals(i2));
         String str0="Hello";
         StringBuffer str1=new StringBuffer("Hello");
         System.out.println(str0.equals(str1));
         StringBuilder str2=new StringBuilder("Hello");
         System.out.println(str1.equals(str2));
         String str4= new String("Hello");
         System.out.println(str2.equals(str4));
    }
}
