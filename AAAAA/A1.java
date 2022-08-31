// package AAAAA;

public class A1 {
    
    // public static void main(String[] args) {
    //     A a1 = new A();

    // }
    static int i = m1();
    public static int m1(){
        System.out.println("hi");
        return 1;
    }
     
}
class A{
    A(){
        this(2);
        System.out.println("no arg");
    }
    A(int a){
        this(3.5);
        System.out.println("int arg ");
    }
    A(double d){
        // this();
        System.out.println("double arg");
    }

}
