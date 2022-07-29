// import java.util.ArrayList;
// import java.util.Scanner;

// public class Test {
//     public static void main(String[] args) {
//         int key = 4;
//         int count = 0;
//         int[] arr = { 17, 18, 8, 13, 15, 7, 11, 5, 4, 9, 12, 6, 10, 14, 16, 3};
//         ArrayList <Integer> arr1 = new ArrayList<>();
//         arr1.add(10);
//         System.out.println("here"+ arr1.size());
//         while(true) {
//             //insert in arraylist using temp with the help of scanner
//             System.out.println("if you don't want to insert any element isnert -1");
//             if(temp == -1)
//                 break;
//             else
//                 arr1.add(temp);
//         }
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 if((arr[i]^key) == arr[j]){
//                     System.out.println(arr[i]);
//                     count++;
//                 }
//             }
//        }
        //System.out.println(count);
        // Scanner in = new Scanner(System.in);
        // int size = in.nextInt();
        // int[] arr = new int[size];
        // for(int i = 0; i < size; i++){
        //     arr[i] = in.nextInt();
            
        // }
        // int rotate = in.nextInt();

//    }
//}

import java.lang.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = in.nextInt();
        }
        int b = in.nextInt();

        rotate(arr,b);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

        static public void rotate(int[] arr,int k){
            reverse(arr,0,arr.length-1);
            reverse(arr,0,k-1);
            reverse(arr,k,arr.length-1);
        }

        static public void reverse(int[] arr,int start,int end){
            while(start<end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
    
            }
        }   

        
    
}