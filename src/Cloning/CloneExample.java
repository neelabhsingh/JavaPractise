/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cloning;

/**
 *
 * @author Neelabh
 */
class Employee implements Cloneable{
    private String name;
    private String designation;
    public Employee(){
        this.setDesignation("Programmer");
    }
    public String getDesignation(){
        return designation;
    }
    public String getName(){
        return this.name=name;
    }
    public void setDesignation(String designation){
        this.designation=designation;
    }
    public void setName(String name){
        this.name=name;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class CloneExample {
    public static void main(String [] args){
        Employee jwz=new Employee();
        jwz.setName("Neelabh Singh");
        
        try{
            Employee nee=(Employee)jwz.clone();
            System.out.println(nee.getName());
            System.out.println(nee.getDesignation());
            jwz.setName("ABC");
            System.out.println("name of jwz"+jwz.getName());
            System.out.println("name of ABC"+nee.getName());
        }
        catch(CloneNotSupportedException cnse){
            System.out.println("Cloneable should be implemented "+cnse);
        }
    }
    
}
