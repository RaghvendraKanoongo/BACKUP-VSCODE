import java.util.HashMap;

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

    public static boolean areEqual(int arr1[], int arr2[])
    {
        int N = arr1.length;
        int M = arr2.length;
 
        // If lengths of arrays are not equal
        if (N != M)
            return false;
 
        // Store arr1[] elements and their counts in
        // hash map
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
 
        // Traverse arr2[] elements and check if all
        // elements of arr2[] are present same number
        // of times or not.
        for (int i = 0; i < N; i++) {
 
            // If there is an element in arr2[], but
            // not in arr1[]
            if (!map.containsKey(arr2[i]))
                return false;
 
            // If an element of arr2[] appears more
            // times than it appears in arr1[]
            if (map.get(arr2[i]) == 0)
                return false;
 
            count = map.get(arr2[i]);
            --count;
            map.put(arr2[i], count);
        }
 
        return true;
    }
}
