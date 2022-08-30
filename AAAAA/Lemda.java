// package AAAAA;

public class Lemda {
    public static void main(String[] args) {

        /*
        new DemoLemda(){
            void show(int i){
                sysout("this is show "+i);
            }
        }
        */ 
        DemoLemda obj = (i) -> System.out.println("This is Show "+i);
        
        obj.show(5);
    }
}



interface DemoLemda {
    void show(int i);
 
}
