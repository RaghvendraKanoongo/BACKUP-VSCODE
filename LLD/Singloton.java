// package LLD;

public class Singloton {

    static Singloton instance = new Singloton();
    public static void main(String[] args) {
        Test test = new Test();
    }
    void hello(){
        System.out.println("hello");
    }
}

class Test {
   static Test instance = null;

    static Test getInstance(){
        if(instance == null)
    }
}