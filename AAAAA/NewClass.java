// classpackage AAAAA;

public class NewClass {
    // static {
    //     int ee = 99;
    // }

    // {


    // }
    public static void main(String[] args) {
        // Parent p1 = new Parent();
        // p1.sayHi();
        // Child c1 = new Child();
        // c1.sayHi();
        Child p3 = new Parent();
        p3.sayHi();


    }
    
}

class Parent{
    static void sayHi(){
        System.out.println("hi from Parent");
    }
}
class Child extends Parent{
    int a;

    static void  sayHi(){
        System.out.println("hi from Child");
    }

    // void inChild(){
    //     System.out.println("i am a child");
    // }
}