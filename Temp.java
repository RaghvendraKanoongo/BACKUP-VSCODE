import java.util.LinkedList;
import java.util.Scanner;


public class Temp {
 
    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> llist)
    {
        LinkedList<Integer> revLinkedList = new LinkedList<Integer>();
        for (int i = llist.size() - 1; i >= 0; i--) {
  
            // Append the elements in reverse order
            revLinkedList.add(llist.get(i));
        }
        // Return the reversed arraylist
        return revLinkedList;
    }
 
    public static void main(String[] args)
    {


        LinkedList<Integer> ll1 = new LinkedList<Integer>();
        LinkedList<Integer> ll2 = new LinkedList<Integer>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            ll1.add(sc.nextInt());
        }
        // for (int i = 0; i < n; i++) {
        //     ll2.add(sc.nextInt());
        // }

        ll1 = reverseLinkedList(ll1);
        System.out.println(ll1);
        ll2 = reverseLinkedList(ll2);
    }

}
class A1{
    int a = 1;
}
class B extends A1{
     int a = 2;
}