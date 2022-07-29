// import java.util.Arrays;

// import javax.swing.JPasswordField;

// public class SortByColor {
//     public static void main(String[] args) {
//         int[] arr = {2,2,1,0,0,1,2,0,2,1};

//         int[] arr1 = {2,3};
//         System.out.println(Arrays.toString(arr1));
//         swap(arr1, 0, 1);
//         System.out.println(Arrays.toString(arr1));
//     }
//     static int[] solve(int[] arr){

//         int store0 = 0;
//         int sotre2 = arr.length-1;
//         for (int i = 0; i < arr.length; i++) {
//             //   0|,0|,1|,2|,|0|,|1|,|1,|2,|2,|2
//             //store0 = 1;
//             //store2 = 7
//             if(arr[i] == 0){
//                 swap(arr, i, store0);
//                 store0++;
//             }
//             else if(arr[arr.length-1-i] == 2){
//                 swap(arr,arr.length-1-i , store2);
//                 store2--;
//             }
//         }
//         return arr;
//     }

//     static void swap (int[] arr, int i, int j){
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }


//     public ArrayList<Integer> sortColors(ArrayList<Integer> A) {
	    
// 	    int zero = 0;
// 	    int two = A.size() - 1;
// 	    for (int i = 0; i <= two;) {
// 	        if (A.get(i) == 0) {
// 	            int temp = A.get(zero);
// 	            A.set(zero, 0);
// 	            A.set(i, temp);
// 	            zero++;
// 	            i++;
// 	        } else if (A.get(i) == 2) {
// 	            int temp = A.get(two);
// 	            A.set(two, 2);
// 	            A.set(i, temp);
// 	            two--;
// 	        } else {
// 	            i++;
// 	        }
// 	    }
// 	    return A;
// 	}
// }
