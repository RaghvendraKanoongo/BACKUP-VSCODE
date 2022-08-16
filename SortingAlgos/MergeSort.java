package SortingAlgos;
import java.util.Arrays;

// import Algorithems.SieveOfEratosthenes;


public class MergeSort {
    public static void main(String[] args) {
        System.out.println("babaji");
        int[] arr = {3,5,2,6,1,8,4,9,7};
        mergeSort(arr, 0, arr.length-1);
    }
    static void mergeSort(int[] arr, int s, int e){

       int m = e/2;
       if(s == e){
        return;
       }
        mergeSort(arr, s, m);
        mergeSort(arr, m+1, e);
        
        merge(arr,s,m,e);
    }

    static void merge(int[] arr, int s, int m, int e){
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
            else if(arr[i]>arr[j]){
                sortedArr[k] = arr[j];
                j++;
                k++;
            }
            else if(arr[i] == arr[j]){
                sortedArr[k] = arr[i];
                i++;
                j++;
                k++;
            }
        }
        while(i<=m){
            sortedArr[k] = arr[i];
            i++;
        }
        while(j<=e){
            sortedArr[k] = arr[j];
            j++;
        }
      
            System.out.println(Arrays.toString(sortedArr));
   
        
    }

}

