// import java.util.ArrayList;
// import java.util.Arrays;

// public class SubMatrixSumQueries {
//     public static void main(String[] args) {
//         System.out.println("babaji");
//         ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
//         arr.add(0, new ArrayList<>(Arrays.asList(1,2,3)));
//         arr.add(1, new ArrayList<>(Arrays.asList(4,5,6)));
//         arr.add(2, new ArrayList<>(Arrays.asList(7,8,9)));
//         System.out.println(arr);
//         ArrayList temp = new ArrayList<>();
//         solve(arr, temp, temp, temp, temp);
//     }
//     static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B, ArrayList<Integer> C, ArrayList<Integer> D, ArrayList<Integer> E) {
//         ArrayList<ArrayList<Integer>> enhancedArr = new ArrayList<ArrayList<Integer>>();
//         for (int i = 0; i < A.size(); i++) {
//             for (int j = 0; j < A.get(0).size(); j++) {
//                 System.out.print(A.get(i).get(j));
//             }
//             System.out.println();
//         }
//         return B;
//     }
// }

//[1 0 1 1 0 0 1]
//[]

/**
 * SubMatrixSumQueries
 * used prefix sum matrix in both row and column
 */
public class SubMatrixSumQueries {

    public static void main(String[] args) {
        int [][]arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

                       //{1,3,6},     1   2   3 
                       //{4,9,15},    5   7   9 
                       //{7,15,24}    12  15  18

                        //1 3 6 
                        //5 12 21 
                        //12 27 45 
        int []temp = new int[1];
        solve(arr, temp, temp, temp, temp);
    }

    static  int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {

        int[][] enhancedRowArr = new int[A.length][A[0].length];
        int[][] enhancedColArr = new int[A.length][A[0].length];
        int[][] finalArr = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            int sum2 = 0;
            for (int j = 0; j < A[0].length; j++) {
                 sum += A[i][j];
                 sum2 += A[j][i];
                
                enhancedRowArr[i][j] += sum; 
                enhancedColArr[j][i] += sum2;
            }
            System.out.println();
        }

        for (int i = 0; i < finalArr.length; i++) {
            for (int j = 0; j < finalArr[0].length; j++) {
                if(i == 0){
                    finalArr[i][j] = enhancedRowArr[i][j];
                }
                else if(j == 0){
                    finalArr[i][j] = enhancedColArr[i][j];
                }
                else {
                    finalArr[i][j] = finalArr[i][j-1]+enhancedColArr[i-1][j]+A[i][j];
                }
            }
        }
        print(A);
        System.out.println();
        print(enhancedRowArr);
        System.out.println();
        print(enhancedColArr);
        System.out.println();
        print(finalArr);
        return B;
    }
    static void print(int[][] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}