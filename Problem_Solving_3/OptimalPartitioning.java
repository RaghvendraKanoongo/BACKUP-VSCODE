import java.util.Arrays;

public class OptimalPartitioning {
    public static void main(String[] args) {
        int[] arr= 
        {1,4,7,8,11,13};
        solve(arr);
    }
    private static void solve(int[] arr) {
        Arrays.sort(arr);
        int store = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]-arr[i] < store){
                store = arr[i+1]-arr[i];
            }
        }
        System.out.println(store);
    }
}
