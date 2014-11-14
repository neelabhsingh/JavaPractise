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
class Program{
    public void read(){
        System.out.println("Programmer Interview");
    }
}
public class AnonymousTest1 {
    public static void main(String [] args){
    Program prog=new Program(){
      @Override
      public void read(){
          System.out.println("Annonymous Inner class");
      }    
    };
    prog.read();
   }
}
