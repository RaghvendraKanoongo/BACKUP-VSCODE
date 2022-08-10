// package AAAAA;

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("babaji");
        
    }
}
class A{
    Object hola(){

    }
    void h1(){

    }
    int h1(double i){

    }
}
class B extends A{
    String hola(){// here it is co varient as string is child of Object there B can change return type 

    }
    private int h1(int i){

    }
}