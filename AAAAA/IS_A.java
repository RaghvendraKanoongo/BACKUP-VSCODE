// package AAAAA;

public class IS_A {
    public static void main(String[] args) {
        System.out.println("babaji");
        A a = new B();
        a.hola();// calls child's method
        new B().hola();// calles child's method
        // a.hola2();// error
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

class C {
    int m1(){
        return 0;
    }
}
class D extends C{
    private void m1( ){

    }
}