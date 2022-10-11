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

        ListNode temp =  func(2035);;
        System.out.println(temp.val);

    }

    static ListNode func(int n){

        ListNode ll = new ListNode((n%10));

        n /= 10;
        while(n > 0){
            ll.next = new ListNode();
        }
        return ll;
    }
}
