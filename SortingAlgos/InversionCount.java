// package SortingAlgos;

public class InversionCount {
    static int count = 0;
    public static void main(String[] args) {
        System.out.println("babaji");
    }

    static void divide(int[] arr, int low, int high){
        
        int mid = (low+high)/2;
        if(low == high){
            return;
        }

        divide(arr, low, mid);
        divide(arr, mid+1, high);
        countInversions(arr, low, mid, high);
    }

    static void countInversions(int arr[], int low, int mid, int high){
        int[] temp = new int[]
    }
}
