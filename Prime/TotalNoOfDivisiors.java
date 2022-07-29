// package Prime;
import java.util.Arrays;

public class TotalNoOfDivisiors {
    public static void main(String[] args) {
        System.out.println("babaji");
        count(20);
    }
    static int count(int n){
        
        int[] arr = new int[n+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            if(i == 1||i == 0)
                arr[i] = -1;
        }

        for (int i = 2; i*i <=n; i++) {
            if(arr[i] == i){
                for (int j = i*i; j < arr.length; j+=i) {
                    if(arr[j] == j)
                        arr[j] = i;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int countFactors = 1;
        int temp = 0;
        // while (n>1) {
        //     int p = arr[n];
        //     while (n%p == 0) {
        //         temp++;
        //         n/=p;
        //         if(arr[n] == 1){
        //             n/=n;
        //             if(temp != 0){
        //                 countFactors *= (temp+2);
        //                 temp = 0;
        //             }
        //             else
        //                 countFactors = countFactors*2;
        //         }
        //     }
        //     if(temp != 0){
        //         countFactors = countFactors * (temp+1);
        //         temp = 0;
        //     }
            
        // }

        while (n>1) {
          int p = arr[n];
          temp = 0;
            while (n%p == 0) {
                if(arr[n] == n){
                    temp++;
                    arr[n] = n;
                    n = n/p;
                }
            }
        }
        System.out.println(countFactors);
        return 1;
    }
}
/*
 * 
 *  6 = 0110 
 *  8 = 1000
 *      111 0
 * 
 */