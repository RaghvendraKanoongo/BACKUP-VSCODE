// package Lol;

/**
 * tempCodeRunnerFile
 */
public class tempCodeRunnerFile {
    public static void main(String[] args) {
        int[] arr = {-6,6,-6, 6, -6, 6, -6, 6 ,-6, 6, -6};
         System.out.println( solve(11, arr));
    }

    public static String solve(int N, int[] arr) {
        int sum = 0;
        for(int i = 0; i<N; i++){
            sum += arr[i];
        }
        if(sum==0)
            return "YES";
        else 
            return "NO";
    }
    
}