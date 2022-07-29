public class Pattern {
    static int gg = 0;
    public static void main(String[] args) {
        printPattern(4);
    }

   static int[][] printPattern(int num){
        
        int[][] arr  = new int[num][num];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                
                if(j<=i)
                    arr[i][arr.length-1-j] = j+1;
            }
        }
        printing(arr);
        return arr;
   }

   
   static void printing(int[][] arr){
        for (int[] i : arr) {
            for (int js : i) {
                System.out.print(js+" ");
            }
            System.out.println();
        } 
    }
}
