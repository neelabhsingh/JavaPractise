/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author Neelabh
 */
class Cube{
    int length;
    int breadth;
    int height;
    public int getVolume(){
        return length*breadth*height;
    }
    Cube(){
        this(10,10);
        System.out.println("Default constructor");
    }
    Cube(int l, int b){
        this(l,b,10);
        System.out.println("Having Two parameters");
    }
    Cube(int l, int b, int h){
        length=l;
        breadth=b;
        height=h;
        System.out.println("Having Three parameters");
    }
}
public class Constructor1 extends Cube {
    int weight;

    public Constructor1() {
        super();
        weight=10;
    }

    public Constructor1(int l, int b) {
        this(l,b,10);
    }
    Constructor1(int l, int b, int h){
        super(l,b,h);
        weight=20;
        System.out.println("Finished with parametered Construected havibf 3 params");
    }
    public static void main(String [] args){
        Constructor1 con1=new Constructor1();
        Constructor1 con2=new Constructor1(10,20);
        System.out.println("Volume of con1 is :"+con1.getVolume());
        System.out.println("Volume of con1 is :"+con1.weight);
        System.out.println("Volume of con1 is :"+con2.getVolume());
        System.out.println("Volume of con1 is :"+con2.weight);
    }
    
}
