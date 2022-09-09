//  package Binary_Search;

public class FindK {
    public static void main(String[] args) {
        System.out.println("babaji");
        int[] arr = {2,5};
        int k = 0;
        int low = 0;
        int high = arr.length-1;
        int mid = (low/2)+(high/2);
        int i = 0;
        while (true) {
            if(high == low){
                System.out.println(low);
                break;
            }
            if(arr [mid]  == k){
                System.out.println(mid);
                break;
            }
            if(high == low && arr[low] != k){
                break;
            }
            if(arr[mid]>k){
                high = mid;
            }
            else {
                low = mid+1;
            }
            mid = (low/2)+(high/2);
        }
        System.out.println(-1);
    }
}