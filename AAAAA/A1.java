// package AAAAA;

public class A1 {
    
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.m1(123.3f);
    }
    static void m1(int i){
        System.out.println("inside int");
    }
    static void m1(float i){
        System.out.println("inside float");
    }
}
class A{
    void m1(int i){
        System.out.println("");
    }

}
