/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

/**
 *
 * @author Neelabh
 */
import java.util.*;
public class TestHashMap1 {
    public static void main(String args[]){
        HashMap<Employee,Integer> hashMap=new HashMap<Employee, Integer>();
        Employee e1=new Employee("neelabh",1);
        Employee e2=new Employee("neelagh",2);
        Employee e3=new Employee("neelab",3);
        Employee e4=new Employee("neela",4);
        Employee e5=new Employee("neel",5);
        hashMap.put(e1,1);
        hashMap.put(e2,2);
        hashMap.put(e3,3);
        hashMap.put(e4,4);
        hashMap.put(e5,5);
        Set set=hashMap.entrySet();
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry me=(Map.Entry<Employee,Integer>)itr.next();
            System.out.print(me.getKey()+" ");
            System.out.println(me.getValue());
        }
        Set<Employee> setEmp=hashMap.keySet();
        Iterator<Employee> itr1=setEmp.iterator();
        for(Employee key: hashMap.keySet()){
            System.out.println(key.name+" "+key.id+":"+hashMap.get(key));
        }
    }    
}
class Employee{
    String name;
    int id;
    public Employee(String name, int id){
        this.name=name;
        this.id=id;
    }

    @Override
    public int hashCode() {
        return this.name.length();
    }

    @Override
    public boolean equals(Object obj) {
        boolean result=false;
        if(obj==null||obj.getClass()!=getClass())
            result=false;
        else{
            Employee emp=(Employee)obj;
            if(this.id==emp.id)
                result=true;
        }
        return result; //To change body of generated methods, choose Tools | Templates.
    }   
}
