// package Queue;

import java.util.Arrays;

public class queueCreation {


    public int[] queue = new int[100];
    public int front = -1;
    public int rare = -1;
    
    public static void main(String[] args) {
        
        queueCreation que = new queueCreation();
        que.enqueue(11);
        que.enqueue(12);
        que.enqueue(13);
        que.enqueue(14);

        //que.show();
        
        System.out.println(que.dequeue());

        que.show();
        que.enqueue(21);
        que.show();

    }

    void enqueue(int n){
        if(rare == -1 && front == -1){
            rare = 0;
            front = 0;
            queue[rare] = n;
        }
        else if(rare != queue.length-1){
            rare++;
            queue[rare] = n;
        }
    }
    
    int dequeue(){
        if(front > -1){
            int temp = queue[front];
            for (int i = front; i <= rare-1; i++) {
                queue[i] = queue[i+1];
            }
            rare --;
            if (rare == -1)
                front = -1;
            return temp;
        }
        
        return -1;
    }
    void show(){
        for (int i = 0; i <= rare; i++) {
            System.out.print(queue[i]+" ");
        }
        System.out.println("\nfront is: "+front);
        System.out.println("rare is: "+rare);
    }
}
