// package AAAAA;

public class A1 {
    
  
    final int a;

    A1(int a){
        this.a = a;
    }


    public static void main(String... args){
        A1 a1 = new A1(12);
        System.out.println(a1.a);
        A1 a2 = new A1(13);
        System.out.println(a1.a);
        System.out.println(a2.a);

    }
     
}




class A{
    A(){
        this(2);
        System.out.println("no arg");
    }
    A(int a){
        this(3.5);
        System.out.println("int arg ");
    }
    A(double d){
        // this();
        System.out.println("double arg");
    }

}
