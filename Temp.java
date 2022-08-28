public class Temp {
    public static void main(String[] args) {
       
    }
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode prev = null;
        ListNode present = head;
        ListNode future = present.next;
        
        while(present != null){
            present.next = prev;
            prev = present;
            present = future;
            if(future != null) future = future.next;
        }
        return prev;
    }
}
