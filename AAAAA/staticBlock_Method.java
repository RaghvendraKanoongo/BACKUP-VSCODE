// package AAAAA;

public class staticBlock_Method {
    public static void main(String[] args) {
        System.out.println("babaji");
        A a = new B();
        a.ho
        
        
    }

}
class zz extends staticBlock_Method{
    public static void main(int i) {
        System.out.println("hola");
        staticBlock_Method ss = new zz();
        
    }
}

class A{
    static{
        System.out.println("in A's Static Block");
    }
    {
        System.out.println("in A's instance block");
    }
    static void hola(){
        System.out.println("in static A");
    }
    void hola1(){
        System.out.println("In non static A");
    }

}
class  B extends A{
    {
        System.out.println("in B's instance block ");
    }
    static{
        System.out.println("IN b's static block");
    }
    void hola1(int i){
        System.out.println("in hola1");
    }

}
    

