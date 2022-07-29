// package Arrays2;

public class SubArrayWithMaxSum {
    public static void main(String[] args) {
        System.out.println("babaji");
        int[] arr = {1,-2,1,-3,4,-1,2,1,-5,4,5};
        System.out.println(solve(arr));
    }
    static int solve(int[] arr){// kadan's algorithem

        int currentSum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            maxSum = Integer.max(maxSum, currentSum);
            if(currentSum<0)
                currentSum = 0;
        }
        return maxSum;
    }   
}
