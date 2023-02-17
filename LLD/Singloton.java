// package LLD;

public class Singloton {
    static Singloton instance = new Singloton();
    public static void main(String[] args) {
        instance.hello();
    }
    void hello(){
        System.out.println("inside hello");
    }
}

