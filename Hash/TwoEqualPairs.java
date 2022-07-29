import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * TwoEqualPairs
 */

public class  TwoEqualPairs{
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(2);
        list = equal(list);
        list.forEach(n -> System.out.println(n));
    }

    public static ArrayList<Integer> equal(ArrayList<Integer> arr) {
        // [3, 4, 7, 1, 2, 9, 8] return index //output = [0, 2, 3, 5]
        // A = [2, 5, 1, 6] // output = [0, 1, 2, 3]
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.size();

        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                int sum = arr.get(i) + arr.get(j);

                if (map.containsKey(sum)) {
                    if (map.get(sum).get(0) < i && map.get(sum).get(1) != i && map.get(sum).get(1) != j) {

                        ArrayList<Integer> temp = map.get(sum);
                        temp.add(i);
                        temp.add(j);
                        if (ans.size() == 0) {
                            ans = temp;
                        }
                        // ans = temp;
                        else {

                            for (int k = 0; k < ans.size(); k++) {

                                if (ans.get(k) < temp.get(k))
                                    break;
                                if (ans.get(k) > temp.get(k)) {
                                    System.out.println("hoho");
                                    ans.remove(ans); // line number 50
                                    System.out.println("jsldf"); 
                                    ans = temp;
                                    System.out.println("bhiabahi");
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    map.put(sum, new ArrayList<>(Arrays.asList(i, j)));
                }
            }
        }
        return ans;
    }

}
// import java.util.HashMap;

// /**
//  * TwoEqualPairs
//  */
// public class TwoEqualPairs {
//     static HashMap<Integer, Pairs> map = new HashMap<>();
//     static int[] finalArr;

//     public static void main(String[] args) {
//         int[] arr = { 9, 5, 4, 9, 3, 6, 8, 7, 1, 2, 8, 7, 2, 9, 7, 1, 3, 9, 7, 8, 1, 0, 5, 5};
//         solve(arr);
//         System.out.println(map);
//         for (int i = 0; i < finalArr.length; i++) {
//             System.out.println(finalArr[i]);
//         } // 1 3 3 3 3 2 2 //output:
//     }

//     static void solve(int[] arr) {

//         boolean flag = false;
//         int a1 = 0, b1 = 0, c1 = 0, d1 = 0;
    
//         for (int i = 0; i < arr.length - 1; i++) {

//             for (int j = i + 1; j < arr.length; j++) {

//                 if (map.containsKey(arr[i] + arr[j])) {

//                     if (map.get(arr[i] + arr[j]).i < i && map.get(arr[i] + arr[j]).j != i) { 
//                         //&& map.get(arr[i] + arr[j]).j != j
                        
                        
//                         if (flag == false) {
//                             finalArr = new int[4];
//                             a1 = map.get(arr[i] + arr[j]).i;
//                             b1 = map.get(arr[i] + arr[j]).j;
//                             c1 = i;
//                             d1 = j;
//                             flag = true;
//                         } 
//                         else {
//                             if (a1 <= map.get(arr[i] + arr[j]).i) {//
//                                 if (b1 <= map.get(arr[i] + arr[j]).j) {
//                                     if (c1 <= i) {//c1 = 3
//                                         if (d1 > j) {
//                                             d1 = j;
//                                         } 
//                                         else {
                                            
//                                         }
//                                     } 

//                                     else {
//                                         c1 = i;
//                                         d1 = j;
//                                     }
//                                 } 
//                                 else {
//                                     a1 = map.get(arr[i] + arr[j]).i;
//                                     b1 = map.get(arr[i] + arr[j]).j;
//                                     c1 = i;
//                                     d1 = j;
//                                     System.out.println("hola amigo");
//                                 }
//                             } 
//                             else {
//                                 a1 = map.get(arr[i] + arr[j]).i;
//                                 b1 = map.get(arr[i] + arr[j]).j;
//                                 c1 = i;
//                                 d1 = j;
//                             }
//                         }
//                     }
//                 } 
//                 else
//                     map.put(arr[i] + arr[j], new Pairs(i, j));

//             }

//         }
        
//         finalArr[0] = a1;
//         finalArr[1] = b1;
//         finalArr[2] = c1;
//         finalArr[3] = d1;

//     }

// }

// class Pairs {
//     int i, j;

//     Pairs(int i, int j) {
//         this.i = i;
//         this.j = j;
//     }
// }

// // import java.util.ArrayList;
// // import java.util.HashMap;

// // public class TwoEqualPairs {
// // public static void main(String[] args) {
// // int arr[] = { 3, 4, 7, 1, 2, 9, 8 };

// // solve(arr);
// // }

// // static void solve(int[] array) {

// // if (array.length < 4)
// // return;
// // // key value(i,j);

// // HashMap<Integer, ArrayList> map = new HashMap<>();
// // int first = 0, second = 0, third = 0, forth = 0;
// // boolean flag = false;

// // for (int i = 0; i < array.length - 1; i++) {

// // for (int j = i + 1; j < array.length; j++) {

// // int sum = array[i] + array[j];

// // ArrayList<Integer> list = map.get(sum);

// // if (map.containsKey(sum) && list.get(0) != i && list.get(1) != j) {
// // ArrayList<Integer> list1 = map.get(sum);
// // first = array[list1.get(0)];
// // second = array[list1.get(1)];
// // third = array[i];
// // forth = array[j];
// // flag = true;
// // break;
// // } else {
// // ArrayList<Integer> temp = new ArrayList<>();
// // temp.add(i);
// // temp.add(j);
// // map.put(sum, temp);
// // }
// // }
// // if (flag)
// // break;
// // }

// // System.out.println("First = " + first);
// // System.out.println("Second = " + second);
// // System.out.println("Third = " + third);
// // System.out.println("Forth = " + forth);
// // }
// // }

// // class Pair {

// // int i, j;

// // Pair(int i, int j) {
// // this.i = i;
// // this.j = j;
// // }
// // }


