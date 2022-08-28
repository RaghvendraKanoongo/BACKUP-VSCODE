import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// /**
//  * tempCodeRunnerFile
//  */
// // package vs_code;

// public class tempCodeRunnerFile {

//     public static void main(String[] args) {
//         System.out.println(h(1, 2));
//         int x = 1;
//         int[][] arr = {{12,21},{13,54},{52,63}};
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < i; j++) {
//                 x = x+arr[i][j];
//             }
//         }
//         System.out.println(x);
//     }
//     static int h(int a, int b){
//          a = 9;
//          b = 11;
//         if(b%a < a){
//             {
//                 b = b >> 1;
//                 return a;
//             }
//         }
//         else if(a%b<b){
//             {
//                 b = b << 1;
//                 return b;
//             }   
//         }
//         else  
//         return a%b;
//     }
// }

/**
 * tempCodeRunnerFile
 */
public class tempCodeRunnerFile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = sc.nextInt();
        }

        solve(arr1, arr2, n);

    }

    static int solve(int[] arr1, int[] arr2, int n){

        if(areEqual(arr1, arr2, n))
            return 1;
        else 
            return 0;
    }
    public static boolean areEqual(int arr1[], int arr2[], int n)
    {
        int N = arr1.length;
        int M = arr2.length;
 
        // If lengths of arrays are not equal
        if (N != M)
            return false;
 
        Map<Integer, Integer> map
            = new HashMap<Integer, Integer>();
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (map.get(arr1[i]) == null)
                map.put(arr1[i], 1);
            else {
                count = map.get(arr1[i]);
                count++;
                map.put(arr1[i], count);
            }
        }
 
        for (int i = 0; i < N; i++) {
 
   
            if (!map.containsKey(arr2[i]))
                return false;

            if (map.get(arr2[i]) == 0)
                return false;
 
            count = map.get(arr2[i]);
            --count;
            map.put(arr2[i], count);
        }
 
        return true;
    }
}
