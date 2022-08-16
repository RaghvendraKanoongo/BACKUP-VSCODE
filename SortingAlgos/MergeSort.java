import Algorithems.SieveOfEratosthenes;

// package SortingAlgos;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("babaji");
        int[] arr = {3,5,2,6,1,8,4,9,7};
        mergeSort(arr, 0, arr.length-1/2);
    }
    static int[] mergeSort(int[] arr, int s, int e){

       int m = (s+e)/2;
        mergeSort(arr, s, m);
        mergeSort(arr, m+1, e);
        
        return new int[2];
    }

    static int[] merge(){
        int[] arr = new int[m+e];
    }

}

