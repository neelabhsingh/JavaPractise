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
public class TestLocalMethodInnerClass {
    public static void main(String [] args){
        class Greeter implements Runnable{
            private final String _greeted;
            public Greeter(String greeted){
                super();
                _greeted=greeted;
            }
            @Override
            public void run(){
                System.out.println("greeted");
            }
        }
        new Greeter("world").run();
        new Greeter("dog").run();
    }
    
}
