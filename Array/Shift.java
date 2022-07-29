public class Shift {
    static int[] arr;
    public static void main(String[] args) {
        
       arr = new int[5];
       int[] arr1 = {11,22,33,44,55};
       arr = arr1;

        reverse(arr, 0, arr.length-1);
        // [ [3, 4, 5, 1, 2]
        // [4, 5, 1, 2,x 3] ]
        //{ }
        int[]B = {1,2};
        int[][] finalArr = new int[B.length][arr.length];

        int[] revArr =  new int[arr.length];
        // printing(arr);
        int j = 0;
        // int[] hold = new int[arr.length];
        // for (int i = arr.length-1; i >= 0; i--) {
        //     revArr[j] = arr[i];
        //     hold[j] = arr[i];
        //     j++;
        // }
        // reverse(revArr, 0, arr.length-1);

        // printing(arr);
        // printing(revArr);
        // reverse arary = 5 4 3 2 1 => 5 4 3 1 2 => 3 4 5 1 2 => 3 4 2 1 5 => 4 3 2 1 5
        // reverse array = 5 4 3 2 1 => 5 4 1 2 3 => 4 5 1 2 3
        
        // for (int i = 0; i < B.length; i++) {
            
        //     finalArr[i] = solve(revArr, B[i]%arr.length);
        //     revArr = hold;
        // }
    }

    static int[] solve(int[] arr, int b){
        arr = reverse(arr, arr.length-b, arr.length-1);
        arr = reverse(arr, 0, (arr.length-1)-b);
        printing(arr);
        return arr;
    }

    static public int[] reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        // printing(arr);
        return arr;
    }

    static void printing(int[] A){
        
        for (int i : A) {
            System.out.print(i+" ");
        }
        System.out.println();
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
