// public class OppositeDigonal {
//     static int[][] finalArr ;
//     public static void main(String[] args) {
//         int[][] arr = { {1, 2, 3},
//                         {4, 5, 6},
//                         {7, 8, 9}
//                     };
//                     finalArr = new int[arr.length*2-1][arr.length];

//         oppositeDigonal(arr);
//         print(finalArr);
    
//     }

//     static void oppositeDigonal(int[][] arr){
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j <= i; j++) {    
//                 finalArr [i][j] = arr[j][i-j];
//             }
           
//         }
//         int k = arr.length-1;
//         int leni = arr.length;
//         int lenj = 0;
//         for (int i = 1; i <= k; i++) {
//             for (int j = k; j >= i ; j--) {
//                 finalArr[leni][lenj] = arr[k-j+i][j];
//                 lenj++;
//             }
//             leni++;
//             lenj = 0;
            
//         }
       
//     }

//     static void print(int arr[][]){
//         for (int[] is : arr) {
//             for (int is2 : is) {
//                 System.out.print(" "+is2);
//             }
//             System.out.println();
//         }
//     }
// }


public class OppositeDigonal  {
    static int[][] finalArr ;
    
    public static void main(String[] args) {
        OppositeDigonal o = new OppositeDigonal();
        int[][] arr = { 
                         {1, 2, 3, 32},
                         {4, 5, 6, 55},
                         {7, 8, 9, 77}
                       };
        o.diagonal(arr);
    }
    public int[][] diagonal(int[][] A) {
        int[][] arr = A;
        int[][] arr1 = new int[5][5];
        finalArr = new int[arr.length*2-1][arr.length];
        oppositeDigonal(arr);
        finalArr = arr1;
        return arr1;
    }
    
    static void oppositeDigonal(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {    
                System.out.print(" "+arr[j][i-j]);
                finalArr [i][j] = arr[j][i-j];
            }
            System.out.println();
        }
        
        int k = arr.length-1;
        int leni = arr.length;
        int lenj = 0;
        for (int i = 1; i <= k; i++) {
            for (int j = k; j >= i ; j--) {
                System.out.print(" "+arr[k-j+i][j]);
                finalArr[leni][lenj] = arr[k-j+i][j];
                lenj++;
            }
            leni++;
            lenj = 0;
            System.out.println();
        }
       
    }
}