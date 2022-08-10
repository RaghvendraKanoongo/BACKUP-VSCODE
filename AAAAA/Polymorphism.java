// package AAAAA;

public class Polymorphism {
    public static void main(String[] args) {
        System.out.println("babaji");

        BB b = new CC();
        b.hello();
        /b.chintu();
    }
}
// class A{
    
//     // Object hola(){

//     // }
//     // void h1(){

//     // }
//     // int h1(double i){

//     // }
// }
// class B extends A{
//     // String hola(){// 

//     // }
//     // private int h1(int i){
//     // }
// }

class ZZZ{
    ZZZ(){
        super();
        
    }
}
class AA {
    void hello(){
        System.out.println("in A");
    }
}
class BB extends AA{
    void hello(){
        System.out.println("in B");
    }
}
class CC extends BB{
    void hello(){
        System.out.println("in C");
    }
    void chintu(){
        System.out.println("say yes");
    }
}