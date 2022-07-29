import java.io.*;
public class Sprac {
    static int[] finalArr;
    public static void main(String[] args) {
       
        int[] arr1 = {11,33,22,55,44};
        int  m, r;

        m = (arr1.length-1)/2;
        r = arr1.length-1;
        int[] kid1 = new int[m+1];
        int[] kid2 = new int[r-m];


        for (int i = 0; i <= m; i++) {
            kid1[i] = arr1[i];
        }

        int i = 0;
        for (int j = m+1; j <= r; j++) {
            kid2[i] = arr1[j];
            ++i;
        }
        finalArr = new int[arr1.length];
        sortArrs(kid1, kid2, m);
        // System.out.println("arr1:");
        // show(kid1);
        // System.out.println("arr2:");
        // show(kid2);
    }

    static void sortArrs(int[] arr1, int[] arr2, int m){

        int i = 0;
        int j = 0;
        int k;
         for (k = 0; k < finalArr.length; k++) {
            if ( i < arr1.length && j < arr2.length && arr1[i] < arr2[j] ){
                
                finalArr[k] = arr1[i];
                i++;
            }

            else if ( j < arr2.length && i < arr1.length && arr2[j] < arr1[i] ){
                
                finalArr[k] = arr2[j];
                j++;
            }

            else if (i == arr1.length-1){
                finalArr[k] = arr2[j];
                j++;
            }

            else if (j == arr2.length){
                finalArr[k] = arr1[i];
                i++;
            }
        }

        show(finalArr);
    }

    static void show (int[] arr){
        for (int i: arr) {
            System.out.println(i);
        }
    }
}
