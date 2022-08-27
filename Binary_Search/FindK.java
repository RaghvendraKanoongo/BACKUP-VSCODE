// package Binary_Search

public class FindK {
    public static void main(String[] args) {
        System.out.println("babaji");
        int[] arr = {3,6,9,12,14,19,20,23,25,27};
        int k = 12;
        int low = 0;
        int high = arr.length-1;

        int mid = low+high/2;
        int ans = 0;
        while(low <= high){
            if(k > arr[mid]){
                low = mid;
            }
            else if(k<arr[mid]){
                high = mid;
            }
            if(low == high){
                break;
            }
        }
        System.out.println("Answer is: "+low);
    }
}