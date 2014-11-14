/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anonymous;

/**
 *
 * @author Neelabh
 */
public class LocalInnerClassTest2 {
    private String x="Outer2";
    public static void main(String [] args){
        LocalInnerClassTest2 test=new LocalInnerClassTest2();
        test.doStuff();
    }
    void doStuff(){
        final String z="local variable";
        class MyInner {
            public void seeOuter(){
                System.out.println("Outer x is "+x);
                System.out.println("Local variable z is "+z);
            }
        }
        MyInner my=new MyInner();
        my.seeOuter();
    }
}
