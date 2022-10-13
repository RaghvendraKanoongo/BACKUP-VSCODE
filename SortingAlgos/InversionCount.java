package SortingAlgos;
import java.util.Arrays;


public class InversionCount {
    static int count = 0;
    static int x = 0;
    public static void main(String[] args) {
        System.out.println("babaji");
        int[] arr = {4,1,2,3};
        divide(arr, 0, arr.length-1);
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
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
        int l = low;
        int r = mid+1;
        int i = 0;
        while (true) {

            if(l == low+1 || r == high+1){
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
            }
        }

        while (l != low+1) {
            temp[i] = arr[l];
            l++;
            i++;
        }

        while (r != high+1) {
            temp[i] = arr[r];
            r++;
            i++;
        }
        i = 0;
        System.out.println("here");
        for (int j = low; j <= high ; j++,i++) {
            arr[low] = temp[i];
            
            System.out.println(arr[low]);
        }

        System.out.println("count for "+ ++x +"time is: " +count );
    }
}
