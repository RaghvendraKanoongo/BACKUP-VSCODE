// package AAAAA;

public class Lemda {
    public static void main(String[] args) {
        DemoLemda obj = () -> System.out.println("This is Show");
         
        obj.show();
    }
}



interface DemoLemda {
    void show();
 
}
