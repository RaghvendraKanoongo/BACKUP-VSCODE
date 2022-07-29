package Problem_Solving_6;
public class XorQueries {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,1,0,0,1,0,1,1};
        //          {1,1,0,0,1,0,0,0,1,1,0,1}
        int[][] arr2 = {{2,4},
                        {1,5},
                        {3,5}};
        solve(arr,arr2);
    }

    static int[][] solve(int[] arr1,int[][] arr2) {

        int[] tempXor = new int[arr1.length];
        int store = arr1[0];
        tempXor[0] = arr1[0];
        int finalXor = 0;

        for (int i = 1; i < tempXor.length; i++) {
            
            tempXor[i] = tempXor[i-1] ^ arr1[i];
            System.out.println(tempXor[i]);

        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if(arr2[i][0] == 1)
                    finalXor = tempXor[arr2[i][1]];
                else    
                    finalXor = tempXor[arr2[i][0]-1] ^ tempXor[arr2[i][1]];
            }
        }

        return new int [2][2];

    }
}
