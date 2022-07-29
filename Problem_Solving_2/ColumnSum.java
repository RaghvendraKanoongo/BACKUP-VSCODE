public class ColumnSum {
    public static void main(String[] args) {
        System.out.println("hola");
       int[][] arr =  {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,2,3,4}
                    };

                    solve(arr);
    }
    static int[] solve(int[][] arr){

        int[] finalArr = new int[arr[0].length];

        
        for (int i = 0; i < arr[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            finalArr[i] = sum;
        }
        for (int i = 0; i < finalArr.length; i++) {
            System.out.print(finalArr[i]+" ");
        }
        return finalArr;
    }
}