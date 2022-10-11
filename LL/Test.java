// import java.util.LinkedList;

package LL;

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
        name();

    }

    public static int name() {
        System.out.println("inside");
        try {
            System.out.println(10/0);
            
            try {
                System.out.println(10/0); 
            } 
            catch (Exception e) {
                return 0;
            }
            finally{
                return 0;
            }
        } 
        catch (Exception e) {
            return 0;
        }

        finally{
            return 0;
        }
    }
}
