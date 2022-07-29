package Problem_Solving_6;

public class SumOfSubArrays {
    public static void main(String[] args) {
        System.out.println("babaji");
        int[] arr = {1,2,3,4};
        System.out.println(solve(arr));
    }
    static int solve(int[] arr){

        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            temp = arr[i] * ((i+1) * (arr.length-i)); 
            totalSum += temp; 
            System.out.println(totalSum +"  i is " + i);
        }//                 1  *   0+1  *   2-0 = 2
        //                  2  *   1+1  *   2-1 = 4
        //                  3  *   2+1  *   0 = 
        return totalSum;
    }
}
