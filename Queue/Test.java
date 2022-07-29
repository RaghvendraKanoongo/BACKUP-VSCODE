import java.util.LinkedList;
import java.util.Queue;

import javax.naming.LinkException;

// package Queue;

public class Test {
    public static void main(String[] args) {
        System.out.println("babaji");
        testing();
    }
    static void testing(){
        Queue q = new LinkedList<>();
        
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}
