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
interface ProgrammerInterview{
    public void read();
}
public class AnonymousInterfaceTest {
    public static void main(String [] args){
    ProgrammerInterview p=new ProgrammerInterview() {
            @Override
            public void read() {
                System.out.println("Interface Program");
            }
        }; 
        p.read();
    }
}
