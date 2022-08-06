import java.util.ArrayList;

//package Java;


public class chick1 {
    public static void main(String[] args) {
        
        A a = new B();
        a.print();
    }
}
class A{
    
}
class B extends A{
    
    void print() {
         super.print();
        System.out.println("inside B");
    }

}
