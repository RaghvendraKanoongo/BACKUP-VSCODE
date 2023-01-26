import java.util.Stack;

// package Stack;

/**
 * NearestSmaller1
 */
public class NearestSmaller1 {

    public static void main(String[] args) {
        System.out.println("babaji");
    }

    public static int[] solve(int[] arr){

        Stack <Integer> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            if(stack.isEmpty()&&i == 0){
                stack.push(arr[i]);
                arr[i] = -1;
            }
            else if(arr[i] = )
        }
        return new int[3];
    }

}
