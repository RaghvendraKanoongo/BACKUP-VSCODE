// package Arrays2;

public class SubMatrixSum {
    public static void main(String[] args) {
        System.out.println("babaji");
        int[][] arr = { 
            {1, 2, 3},
            {5, 6, 7},
            {9, 10, 11}
            //{13, 14, 15, 16}
          };
    }

    static int solve(int[][] arr){
        
        int finalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                 
            }
        }
        return finalSum;
    }
}


/**
    public int solve(int[][] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int top_left = (i + 1) * (j + 1);
                int bottom_right = (n - i) * (n - j);
                sum += (top_left * bottom_right * arr[i][j]);
            }
        }
        return sum;
    }
 */