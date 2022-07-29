// import java.util.HashMap;
// import java.util.Map.Entry;


// public class PairSumK {
//     static HashMap <Integer,Integer> map = new HashMap<>();
//     static int[] store = new int[2];   
//     public static void main(String[] args) {
        
//         int[] arr = {-10, -10, -10};
//         int k = -5;
//         store[0] = Integer.MAX_VALUE-2;
//         store[1] = Integer.MAX_VALUE-1;
//         hashInsertion(arr, k);
//         for (int i = 0; i < arr.length; i++) {

//             if(map.containsValue(arr[i]) && map.containsValue(k-arr[i])){

//                 int[] temp = new int [2];
//                 temp[0] = getKeys(arr[i]);
//                 temp[1] = getKeys(k-arr[i]);

//                 if(temp[0]>temp[1]){
//                     int hold = temp[0];
//                     temp[0] = temp[1];
//                     temp[1] = hold;
//                 }

//                 if(store[0] == Integer.MAX_VALUE){
//                     store[0] = temp[0];
//                     store[1] = temp[1];
//                 }

//                 if(temp[0] == store[0]){
//                     if(temp[1]<store[0]){
//                         store[0] = temp[0];
//                         store[1] = temp[1];
//                     }
//                 }

//                 else if(temp[1]<store[1]){
//                     store[0] = temp[0];
//                     store[1] = temp[1];
//                 }
//             }
//         }
//         if(store[0] == Integer.MAX_VALUE-2 ){
//             store[0] = 0;
//             store[1] = 0;
//         }
//         else{
//             store[0] += 1;
//             store[1] += 1;
//             if(store[0] == store[1]){
//                 store[1]+= 1;
//             }
//             if(store[0] == Integer.MAX_VALUE-2 ){
//                 store[0] = 0;
//                 store[1] = 1;
//             }
//         }
//        printing(store);
//     }

//     static void hashInsertion(int[] arr, int KEY){
//         for (int i = 0; i < arr.length; i++) {
//             map.put(i, arr[i]);
//         }
//     }

//     static int getKeys(int num){
//         for (Entry entry : map.entrySet()) {
//             if((int)entry.getValue() == num){
//                 return (int) entry.getKey();
//             }
//         }
//         return -1;
//     }

//     static void printing(int[] arr){
//         for (int i : arr) {
//             System.out.print(i+" ");
//         }
//         System.out.println();
//     }
// }

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class PairSumK {
    static HashMap <Integer,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        
        PairSumK psk = new PairSumK();
        int[] arr = {-7, -6, 7, 10, -1, -9, -8};
        //            1,  0, 1,  0,  0,  1,  1, 1,  1,  0,  0, 0, 1, 1, 1, 0, 1,  0, 0,  1,  0,  1,  0,  1
        int k = -2;
        int[] arr2 = psk.twoSum(arr, k);
        System.out.println(Arrays.toString(arr2));
        
        
    }

    static int[] store = new int[2];  
    static int Emptyarr[];
    
    public int[] twoSum(final int[] A, int B) {
        int[] arr = A;
        int k = B;
        store[0] = Integer.MAX_VALUE-2;
        store[1] = Integer.MAX_VALUE-1;
        hashInsertion(arr, k);
        
        
        for (int i = 0; i < arr.length; i++) {

            if(map.containsValue(arr[i]) && map.containsValue(k-arr[i])){

                int[] temp = new int [2];
                temp[0] = getKeys(arr[i]);
                temp[1] = getKeys(k-arr[i]);
                
                if (temp[0] == 4){
                    System.out.println();
                                    }
                int i1 = i;
                int i2 = k-arr[i];
                if (i1 == i2)
                    System.out.println("I1 is "+i1+"and I2 is"+i2);
                
                if(temp[0]>temp[1]){
                    int hold = temp[0];
                    temp[0] = temp[1];
                    temp[1] = hold;
                }

                if(store[0] == Integer.MAX_VALUE-2){
                    store[0] = temp[0];
                    store[1] = temp[1];
                }

                if(temp[0] == store[0]){
                    if(temp[1]<store[0]){
                        store[0] = temp[0];
                        store[1] = temp[1];
                    }
                }

                else if(temp[1]<store[1]){
                    store[0] = temp[0];
                    store[1] = temp[1];
                }
                
            }
        }
        System.out.println(Integer.MAX_VALUE-2);
        System.out.println(store[0]);
        if(store[0] == (int)Integer.MAX_VALUE-2 ){
            return new int[0];
        }

        else{
            store[0] += 1;
            store[1] += 1;
            if(store[0] == store[1]){
                store[1]+= 1;
            }
            if(store[0] == Integer.MAX_VALUE-2 ){
                store[0] = 0;
                store[1] = 1;
            }
        }
        return  store;
    }
    
    static void hashInsertion(int[] arr, int KEY){
        for (int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);
        }
    }

    static int getKeys(int num){
        for (Entry entry : map.entrySet()) {
            if((int)entry.getValue() == num){
                return (int) entry.getKey();
            }
        }
        return -1;
    }
}