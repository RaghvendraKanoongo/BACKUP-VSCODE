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
    static Test instance = new Test();

    static {
        System.out.println("Test class loaded.");
    }

    public Test() {
        System.out.println("Test instance created.");
    }
}