/**
 * Temp
 */
public class Temp {

    public static void main(String[] args) {
        
    }
    public SinglyLinkedList addTwoNumbers(SinglyLinkedList l1, SinglyLinkedList l2) {
        SinglyLinkedList temp=new SinglyLinkedList(0);
        SinglyLinkedList res=temp;
        int carry=0,sum=0;
        while(l1!=null && l2!=null){
            sum=l1.val+l2.val+carry;
            SinglyLinkedList node=new SinglyLinkedList(sum%10);
            carry=sum/10;
            l1=l1.next;
            l2=l2.next;
            temp.next=node;
            temp=temp.next;
        }
        while(l1!=null){
            sum=l1.val+carry;
            SinglyLinkedList node=new SinglyLinkedList(sum%10);
            carry=sum/10;
            temp.next=node;
            temp=temp.next;
            l1=l1.next;
        }
        while(l2!=null){
            sum=l2.val+carry;
            SinglyLinkedList node=new SinglyLinkedList(sum%10);
            carry=sum/10;
            temp.next=node;
            temp=temp.next;
            l2=l2.next;
        }
        if(carry==1){
            SinglyLinkedList node1=new SinglyLinkedList(carry);
            temp.next=node1;
            temp=temp.next;
        }
        return res.next;
    }
}

