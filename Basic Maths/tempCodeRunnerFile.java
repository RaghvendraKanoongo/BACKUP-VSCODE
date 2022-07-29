import java.util.Arrays;

// public class tempCodeRunnerFile {
//     public static void main(String args[]) {
//         System.out.println(uniquePaths(2, 2));
//     }
//     static int count = 0;
//     static int uniquePaths(int A, int B) {

//         if(A>= 0 || B >= 0){
//             count++;
//             if(A>0)
//                 uniquePaths(A--,B);
//             if(B>0){
//                 uniquePaths(A,B--);
//             }
//             return 0;
//         }
//         else 
//             return count;
//     }
// }

/**
 * tempCodeRunnerFile
 */
// public class tempCodeRunnerFile {

// public static void main(String[] args) {

// int[] arr = {5,5,5,5,4};
// System.out.println(solve(arr));
// }
// static int solve(int[] A) {
// Arrays.sort(A);

// if(A[A.length-1] == A[A.length-2]){

// for (int i = A.length-2; i >= 0;) {
// if(A[A.length-1] == A[i]){
// if(i==0){
// return 0;
// }
// else i--;
// }
// else
// return A[i];

// }
// }

// return A[A.length-2];
// }

// public static void main(String[] args) {
// System.out.println(8%1);
// }
// }
// class tempCodeRunnerFile {
//     public static void printPascal(int n) {
//         int[] finalArr = new int[n];
//         int k = 0;
//         for (int line = 1; line <= n; line++) {

//             int C = 1;
//             for (int i = 1; i <= line; i++) {
//                 if(line == n){
//                     finalArr[k] = C;
//                     k++;
//                     C = C * (line - i) / i;
//                 }
//             }
//         }
//         System.out.println(Arrays.toString(finalArr));
//     }
//     public static void main(String[] args) {
//         int n = 4;
//         printPascal(n+1);
//     }
// }
class tempCodeRunnerFile {

    static int bar(int x, int y){
        if (y == 0)   return 0;
        return (x + bar(x, y-1));
    }

    static int foo(int x, int y){
        if (y == 0) return 1;
        return bar(x, foo(x, y-1));
    }
    public static void main (String[] args)
    {
        
    }

}