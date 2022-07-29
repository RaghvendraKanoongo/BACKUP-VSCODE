package Prime;
import java.util.Arrays;

// package Algorithems;

public class SmallestPrimeFactorTillN {
    public static void main(String[] args) {
        
        System.out.println("babaji");
        System.out.println(Arrays.toString(findSmallestPrimeTillN(20)));
    }
    // here 1 means the number is prime 
    static int[] findSmallestPrimeTillN(int n){
        
        int[] arr = new int[n+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
            if(i == 0|i == 1)
                arr[i] = -1;
        }
        for (int i = 2; i*i <= n; i++) {
            if(arr[i] == 1){
                for (int j = i*i; j <= n; j+=i) {
                    if(arr[j] == 1){
                        arr[j] = i;
                    }
                }
            }
        }
        int count = 0;
        for (int i = 2; i < arr.length; i++) {
            if(arr[i] == 1)
                count++;
        }
        System.out.println(count);
        return arr;
    }
    // TC = O(log(log(N)))
}
