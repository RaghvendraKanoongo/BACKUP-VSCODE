// package AAAAA;

public class UnderstandingInterf {
    public static void main(String[] args) {
        System.out.println("pran nath babaji");
    }
}

interface A{
     void m();
}
abstract class B implements A{
    public abstract void m();// here public should be given bcoz interface ki sari 
                            //  methods public hoth h and apan usko default leja re h 
}
class X{
    void stay(){
        
    }
}