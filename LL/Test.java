// import java.util.LinkedList;

// package LL;

import java.util.LinkedList;

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
        // name();
        LinkedList <Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(2);
        System.out.println(list);

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
