// import java.util.ArrayList;

//package Java;


public class chick1 {
    public static void main(String[] args) {
        
        B a = new B();
        
        YZ yz = new YZ();
        yz.hola();
        System.out.println(yz.a);   

        Runnable r = new Runnable(){
            @Override
                public void run(){

                }
        };

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
    
    static void hola(){
        System.out.println("in Z");
    }
}

interface Y{
    int a = 10;
    default void  hola(){
        System.out.println("in Y");
    }
}

class YZ implements Z,Y{
    
}
enum Level{
    HIGH,
    MEDIUM,
    LOW;
}
enum Numbers{
    h,q;
}