// public class Test {
//     public static void main(String[] args) {
         
//         MyThread.m1 =  Thread.currentThread();
//         MyThread m2 = new MyThread();
//         m2.start();
        
//         for (int i = 0; i < 5; i++) {
            
//             System.out.println("In the main");
//         }
//     }
// }

// class MyThread extends Thread{
//     static Thread m1;
//     public void run(){
        
//         try {
//             Thread.sleep(300);
//             m1.interrupt();
//             System.out.println("In the try");
            
//         }catch(Exception e){
//             System.out.println("In the catch ");
//         }
//     }
// }




/**
 * Test
 */
/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(0xff);
    }
}

// public class Test {

//     public static void main(String[] args) {
//         Test t = new Test();
//         System.out.println(t.solve(8));
//     }

//     public int solve(int A) {
//         int value = 0;
//         for (int i = 0; i < A; i++) {
//             value += counting(i);
//         }
//        return value;
//     }

//     static int counting(int a){
//         if (a == 0)
//             return 0;

//         else
//             return (a & 1) + counting(a >> 1);
//     }
// }