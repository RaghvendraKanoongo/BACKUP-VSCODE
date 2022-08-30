// package AAAAA;

public class Lemda {
    public static void main(String[] args) {
        DemoLemda obj = new DemoLemda() {
            public void show() {
               System.out.println("This is Show");
            }
        };
        obj.show();
    }
}



interface DemoLemda {
    void show();
}
