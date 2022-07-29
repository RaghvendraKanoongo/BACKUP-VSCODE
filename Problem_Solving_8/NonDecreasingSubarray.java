import java.util.Arrays;

//package Problem_Solving_8;

public class NonDecreasingSubarray {
    public static void main(String[] args) {
        System.out.println("pran nath babaji ");
        int[] A = {1,7,3,4,9};
        int[][] B = {{1,2},
                     {2,4}};
        System.out.println(Arrays.toString(solve(A, B)));
        }   //      1, 7, 3, 4, 9
    static public int[] solve(int[] A, int[][] B) {

        int[] finalArr = new int[B.length];
        int[] temp = new int[A.length];
        int store = 1;
        temp[0] = 1;
        for (int index = 1; index < A.length; index++) {
            if(A[index]>=A[index-1]){

                temp[index] = store;
            }
            else{
                store++;
                temp[index] = store;
            }
            
        }
        for (int i = 0; i < B.length; i++) {
           if(B[i][0] == B[i][B[i][0]+B[i][1]]){
               finalArr[i] = 0;
           }
           else 
            finalArr[i] = 1;
        }
        return finalArr;
    }
}
