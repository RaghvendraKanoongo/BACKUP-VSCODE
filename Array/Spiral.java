public class Spiral {
    public static void main(String[] args) {
        int A = 4;
        int[][]arr = {
                    {11,22},
                    {44,55}
        };
        spiral(3);
    }

    static void print(int arr[][]){
        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.print(" "+is2);
            }
            System.out.println();
        }
    }
    
    static int[][] spiral(int A){
        int[][] arr = new int[A][A];
        int t = 0;
        int b = arr.length-1;
        int r = arr[0].length-1;
        int l = 0;
        int count = 1;
        while (count <= (arr.length*arr.length)) {
            
            for (int i = l; i <= r; i++){
                arr[t][i] = count;
                count++;
            }
            
            t++;

            for (int i = t; i <= b; i++) {
                arr[i][r] = count;
                count++;
            }
            
            r--;

            for (int i = r; i >= l; i--) {
                arr[b][i] = count;
                count++;
            }
            
            b--;

            for (int i = b; i >= t; i--) {
                arr[i][l] = count;
                count++;
            }
            l++;
            
        }
        return arr;
    }
}
