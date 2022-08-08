// package SortingAlgos;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("babaji");
        A a = new B();
        
    }

}

class A{
    static{
        System.out.println("in Static Block");
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
    static{
        System.out.println("IN b's static block");
    }

}