import java.util.ArrayList;

//package Java;


public class chick1 {
    public static void main(String[] args) {
        
        B a = new C();
        a.print();
    }
}
class A{
    // void print(){
    //     System.out.println("inside A");
    // }
}
class B extends A{
    
    void print() {
        
        System.out.println("inside B");
    }
}
class C extends B{

}
