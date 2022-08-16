// package SortingAlgos;
import java.util.Arrays;

// import Algorithems.SieveOfEratosthenes;


public class MergeSort {
    public static void main(String[] args) {
        System.out.println("babaji");
        int[] arr = {9,8,7,6,1,4,3,5,2};
        mergeSort(arr, 0, arr.length-1);
    }
    static void mergeSort(int[] arr, int s, int e){

       int m = (e+s)/2;
       if(s == e){
        return;
       }
        mergeSort(arr, s, m);
        mergeSort(arr, m+1, e);
        
        arr = merge(arr,s,m,e);
        System.out.println(Arrays.toString(arr));
    }

    static int[] merge(int[] arr, int s, int m, int e){
        int[] sortedArr = new int[e+1];
        int i = s;
        int j = m+1;
        int k = 0;
        while(i<=m && j<=e){
            if(arr[i]<arr[j]){
                sortedArr[k] = arr[i];
                i++;
                k++;
            }
            else{
                sortedArr[k] = arr[j];
                j++;
                k++;
            }
            
        }
        while(i<=m){
            sortedArr[k] = arr[i];
            i++;
            k++;
        }
        while(j<=e){
            sortedArr[k] = arr[j];
            j++;
            k++;
        }
        int k1 = 0;
        for (int k2 = s; k2 <= e; k2++,k1++) {
            arr[k2] = sortedArr[k1];
        }
        return arr;
        
    }

}

