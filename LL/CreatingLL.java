public class CreatingLL {
    public static void main(String[] args) {
        Node n1 = new Node();
        n1.add(11);
        n1.add(22);
        n1.add(33);
        n1.add(44);
        n1.add(55);
        Node n2 = new Node();
        n2.add(11);
        n2.add(22);
        n2.add(33);
        n2.add(44);
        n2.add(55);

        System.out.println("Here: "+n1.countPairs(n1,n2, 44));
    }
}
class Node{

    int data;
    Node next;
    Node head;

    Node(){};
    Node(int data){
        this.data = data;
    }


    void trying(){
        Node temp = head;
        System.out.println(temp.next.data);
    }
    void add(int data){

        Node toAdd = new Node(data);
        if (head == null){
            head = toAdd;
            toAdd = toAdd.next;
        }

        else {
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = toAdd;
            toAdd.next = null;
        }
    }

    void show(){
        Node temp = head;
        while(temp != null){
            
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void countNodes(){
        Node temp = head;
        int count = 0;
        while(temp != null){
            ++count;
            temp = temp.next;
        }
        System.out.println("Count is: "+ count);
        
    }

    void trav(){
        Node temp = head;
        Node temp2 = head;
        while (temp.next.next != null) {
            
            System.out.println(temp.data);
            temp = temp.next;
        }
        Node temp1 = temp;
        temp = temp.next;
        temp1 = temp;
        System.out.println("temp1 values: "+temp1.data);
        while (temp2 != null) {
            
            System.out.println(temp2.data);
            temp2 = temp2.next;
        }   
    }

    void delete(int num)   {
        Node temp = head;
        while (temp.next != null) {

            if(temp.next.next == null && temp.next.data == num){
                temp.next = null;
            }

            else if (temp.next.data == num){
                temp.next = temp.next.next;
            }

            else if (temp.data == num){
                head = temp.next;
            }
            temp = temp.next;
        }
    }

    int countPairs(Node obj1, Node obj2, int x){

        Node temp1 = obj1.head;
        Node temp2 = obj2.head;
        int count = 0;
        
        while(temp1 != null){
            while(temp2 != null){
                if ((temp1.data+temp2.data) == x){
                    count++;
                }
                temp2 = temp2.next;
            }
            temp2 = obj1.head;
            temp1 = temp1.next;
        }
        for (int i = 0; i < ListNode.size()-1; i++) {
            
        }
        return count;
    }
    
}
