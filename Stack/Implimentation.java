// package Stack;

public class Implimentation {
    public static void main(String[] args) {

        stack s = new stack(100);
        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);
        s.show();
        s.peek();
        s.pop();
        s.pop();
        s.push(69);
        s.pop();

        s.show();
        s.peek();
        s.pop();
        s.pop();
        
        s.pop();
        s.peek();
        s.pop();
        System.out.println("hola");
    }
}
class stack{

    int top;
    int[] stack;

    stack(int n){
        stack = new int[n];
        top = -1;
    }

    void push(int data){
        top ++;
        stack[top] = data;
    }
    void pop(){
        if(top>=0)
            top--;
        else 
            System.out.println("Stack is already empty");
    }
    
    void peek(){
         if(top>=0)
            System.out.println("\npeek: "+stack[top]);
    }

    void show(){
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i]+ " ");
        }
    }
}
