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
        
        return merge(arr,s,m,e);;
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
        for (int index = s; index < e; index++) {
            arr[index] = 
        }
        return sortedArr;
    }

}

