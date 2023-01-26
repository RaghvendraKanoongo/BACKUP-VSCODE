// package Stack;
import java.util.Arrays;
import java.util.Stack;

/**
 * NearestSmaller1
 */
public class NearestSmaller1 {

    public static void main(String[] args) {
        System.out.println("babaji");
        int[] arr = {4,6,10,11,7,8,3,5};
        System.out.println(Arrays.toString(solve(arr)));
    }

    public static int[] solve(int[] arr){

        Stack <Integer> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            if(stack.isEmpty() && i == 0){
                stack.push(arr[i]);
                arr[i] = -1;
            }
            else if(arr[i]>stack.peek()){
                int temp = arr[i];
                arr[i] = stack.peek();
                stack.push(temp);
            }
            else{
                while(arr[i]<stack.peek()){
                    stack.pop();
                }
                if( stack.isEmpty()){
                    stack.push(arr[i]);
                    arr[i] = -1;
                }
                else if(arr[i]>stack.peek()){
                    int temp = arr[i];
                    arr[i] = stack.peek();
                    stack.push(temp);
                }
            }
        }
        return arr;
    }

}
