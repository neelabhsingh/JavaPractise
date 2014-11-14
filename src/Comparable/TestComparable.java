/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparable;

/**
 *
 * @author Neelabh
 */
class Person implements Comparable{
    
    private String name;
    private int age;
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString()
    {
        return "";
    }
    @Override
    public int compareTo(Object obj) {
        if(this.age==((Person) obj).age)
            return 0;
        else 
            return this.age> ((Person)obj).age? 1:-1;
    }    
}
public class TestComparable {
    public static void main(String args[]){
        Person p1=new Person("Adam",45);
        Person p2=new Person("Steve", 60);
        int result=p1.compareTo(p2);
        switch(result){
            case -1:{
                System.out.println("The "+ p2.getName()+"is older!");
                break;
            }
            case 1:{
                 System.out.println("The "+p1.getName()+"is older");
                 break;
            }
            default:
                System.out.println("The two persons are of the same age");            
        }
    }    
}
