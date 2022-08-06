// import java.util.ArrayList;

//package Java;


public class chick1 {
    public static void main(String[] args) {
        
        A a = new B();
        a.print();
        YZ yz = new YZ();
        yz.hola();
    }
}
abstract class A{
    void print(){
        System.out.println("inside A");
    }
   
}
class B extends A{
    
   
}
class C extends B{

}

interface Z{
    default void hola(){
        System.out.println("in Z");
    }
}

interface Y{
    default void  hola(){
        System.out.println("in Y");
    }
}

class YZ implements Z,Y{
    
}