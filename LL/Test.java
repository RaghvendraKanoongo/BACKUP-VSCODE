import java.util.LinkedList;

// package LL;

class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { 
            this.val = val; 
        }
        ListNode(int val, ListNode next) { 
            this.val = val; this.next = next; 
        }
}

public class Test {
    public static void main(String[] args) {
        System.out.println("hola");

        try {
            System.out.println("outer try 1");
            try {
                System.out.println("in intter try");
            } catch (Exception e) {
                System.out.println("in inner catch");
            }
            finally{
                return 0;
            }
        } catch (Exception e) {

        }
        finally{
            System.out.println("outer finally1");
        }
        try {
            System.out.println("outer try 1");
            
        } catch (Exception e) {

        }
        finally{
            System.out.println("outer finally1");

        }


    }

    st
    
}
