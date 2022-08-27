// package Binary_Search;

public class FindK {
    public static void main(String[] args) {
        System.out.println("babaji");
        int[] arr = {12,13,14,16,17};
        int k = 12;
        int low = 0;
        int high = arr.length-1;
        int mid = (low+high)/2;

        while(true){
            if(arr[mid] == k){
                System.out.println(mid);
                break;
            }
            if(arr[high] == k){
                System.out.println(high);
                break;
            }
            if(arr[mid]<k)
                low = mid;
            else if(arr[mid]>k)
                high = mid;
            mid = (low+high)/2;
        }
    }
}