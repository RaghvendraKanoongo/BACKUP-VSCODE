/**
 * SubarrayWithLeastAverage
 */
public class SubarrayWithLeastAverage {

    public static void main(String[] args) {
        
        int[] arr = {3, 7, 90, 20, 10, 50, 40};
        int b = 3;
        System.out.println(solve(arr, b));

    }

    static int solve (int[] arr, int b){
        int index = 0;
        int store = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length-b; i++) {
            int temp = 0;
            for (int j = i; j < i+b; j++) {
                temp += arr[j];
            }
            if(temp<store){
                store = temp;
                index = i;
            }
            
        }
        return index;
    }
}