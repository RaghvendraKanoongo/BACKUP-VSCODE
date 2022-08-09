// package AAAAA;

class Animal{}
class Monkey extends Animal{}
public class IS_A {
    public static void main(String[] args) {
        System.out.println("babaji");
        A a = new B();
        a.hola();// calls child's method
        new B().hola();// calles child's method
        // a.hola2();// error
        IS_A a1 = new IS_A();
        float i = 99.8f;
        a1.m1(66.6);// automatic promotion in over
        //a1.m2(1, 2);// ambiguis
        Animal am = new Monkey();
        

    }
    void m1(Animal a){

    }
    void m1(Monkey m){

    }
    void m1(double f){
        System.out.println("this is float "+f);
    }
    void m1(int l){
        System.out.println("this is long "+l);
    }
    void m2(int i,double d){
        System.out.println("hi");
    }
    void m2(double i,int d){
        System.out.println("hi");
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
    private void m1( int i ){

    }
}
