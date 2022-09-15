// classpackage AAAAA;

public class NewClass {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.sayHi();
        Child c1 = new Child();
        c1.sayHi();
        Parent p3 = new Child();
    }
}

class Parent{
    void sayHi(){
        System.out.println("hi from Parent");
    }
}
class Child extends Parent{
    int a;
    void sayHi(){
        System.out.println("hi from Child");
    }
    void inChild(){
        sysout
    }
}