// package AAAAA;

public class  Thread_Demo {
    public static void main(String[] args) {
        System.out.println("babaji");
    }
}

class MyThread extends Thread{
    void run(){
        System.out.println("inside MyThread's Run");
    }
}
