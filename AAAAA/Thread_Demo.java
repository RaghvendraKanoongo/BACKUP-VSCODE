// package AAAAA;

public class  Thread_Demo {
    public static void main(String[] args) {
        System.out.println("babaji");

        MyThread mt = new MyThread();
        mt.start();
        for (int i = 0; i <10; i++) {
            System.out.println("Main Thread");
        }
    }
}

class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 30; i++) {
            System.out.println("Child Thread");
        }
    }
}
