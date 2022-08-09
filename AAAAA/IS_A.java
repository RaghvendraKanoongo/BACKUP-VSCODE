// package AAAAA;

public class IS_A {
    public static void main(String[] args) {
        System.out.println("babaji");
        A a = new B();
        a.hola();
        new B().hola();// 
        a.hola2();
    }
}

class A{
    void hola(){
        System.out.println("from A");
    }
}
class B extends A{
    void hola(){
        System.out.println("from B");
    }
    void hola2(){
        System.out.println("again from B");
    }
}