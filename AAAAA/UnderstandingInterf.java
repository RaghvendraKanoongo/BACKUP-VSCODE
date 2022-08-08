// package AAAAA;

public class UnderstandingInterf {
    public static void main(String[] args) {
        System.out.println("pran nath babaji");
        PP pp = new PP();
        pp.hola();
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
     protected void stay(){
        
    }
}
class Y extends X{
    // private void stay(){} -- same thing weker access aara h 
        
    
}

interface D{
    int i = 19;
    void hola();
}
class PP implements D{
    public void hola(){
        System.out.println(i++);
    }
}