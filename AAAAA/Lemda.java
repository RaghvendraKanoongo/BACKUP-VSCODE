// package AAAAA;

public class Lemda {
    public static void main(String[] args) {

        /*
        new DemoLemda(){
            void show(){
                sysout("this is show");
            }
        }
        */
        DemoLemda obj = () -> System.out.println("This is Show");
        
        obj.show();
    }
}



interface DemoLemda {
    void show();
 
}
