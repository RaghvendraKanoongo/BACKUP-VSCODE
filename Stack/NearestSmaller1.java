// package Stack;
import java.util.Arrays;
import java.util.Stack;

/**
 * NearestSmaller1
 */
public class NearestSmaller1 {

    public static void main(String[] args) {
        System.out.println("babaji");
        int[] arr = {5,2,8,10,12,6,1};
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
                while(!stack.isEmpty() && arr[i]<stack.peek()){
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
