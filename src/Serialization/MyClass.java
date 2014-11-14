/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serialization;

import java.io.*;

/**
 *
 * @author Neelabh
 */
class NonSerial{
    
}
public class MyClass {
    private static final long serialVersionUID=1L;
    private NonSerial nonSerial;
    MyClass(NonSerial nonSerial){
        this.nonSerial=nonSerial;
    }
    public static void main(String [] args) throws FileNotFoundException{
        NonSerial nonSer=new NonSerial();
        MyClass c=new MyClass(nonSer);
        try{
            FileOutputStream fs=new FileOutputStream("test1.ser");
            ObjectOutputStream os=new ObjectOutputStream(fs);
            os.writeObject(c);
            os.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        try{
            FileInputStream fis=new FileInputStream("test1.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            c=(MyClass)ois.readObject();
            ois.close();
        }
        catch(Exception e){
        e.printStackTrace();
    }
        
    }
}









