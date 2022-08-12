// package AAAAA;

public class  Thread_Demo {
    public static void main(String[] args) {
        System.out.println("babaji");

        MyThread mt = new MyThread();
        mt.start();
        for (int i = 0; i <5; i++) {
            System.out.println("in void main");
        }
    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("inside MyThread's Run");
    }
}
