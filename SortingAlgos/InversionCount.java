// package SortingAlgos;
import java.util.Arrays;


public class InversionCount {
    static int count = 0;
    static int x = 0;
    public static void main(String[] args) {
        System.out.println("babaji");
        int[] arr = {1,2};
        divide(arr, 0, arr.length-1);
        //  System.out.println(count);
        
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
        int[] temp = new int[high-low+1];
        if (low == 0 && high == 3){
            int b = 0;
        }
        int l = low;
        int r = mid+1;
        int i = 0;
        while (true) {

            if(l == mid+1 || r == high+1){
                break;
            }
            else if(arr[l]>arr[r]){
                count += mid-l+1; 
                temp[i] = arr[r];
                r++;
                i++;
            }
            else {
                temp[i] = arr[l];
                l++;
                i++;
            }
        }

        while (l != mid+1) {
            temp[i] = arr[l];
            l++;
            i++;
        }

        while (r != high+1) {
            temp[i] = arr[r];
            r++;
            i++;
        }
        System.out.println(Arrays.toString(temp));
        i = 0;
        System.out.println("here");
        for (int j = low; j <= high ; j++,i++) {
            arr[j] = temp[i];
            
            // System.out.println(arr[j]);
        }

        // System.out.println("count for "+ ++x +"time is: " +count );
    }
}
