// package Algorithems;

public class KadansAlgo {
    public static void main(String[] args) {
        System.out.println("babaji");
        int[] arr = {-1,1,1,-1,1,1,-1,-1,-1,-1,1,-1};
        System.out.println(solve(arr));
    }
    static int solve(int[] arr){// kadan's algorithem

        int currentSum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(currentSum == Integer.MIN_VALUE)
                currentSum = arr[i];
            else
                currentSum += arr[i];
            maxSum = Integer.max(maxSum, currentSum);
            if(currentSum<0)
                currentSum = 0;
        }
        return maxSum;
    }
}

