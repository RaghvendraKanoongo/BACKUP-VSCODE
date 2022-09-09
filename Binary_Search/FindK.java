// package Binary_Search;

public class FindK {
    public static void main(String[] args) {
        System.out.println("babaji");
        int[] arr = {12,13,14,16,17};
        int k = 12;
        int low = 0;
        int high = arr.length-1;
        int mid = (low/2)+(high/2);

        while (true) {
            if(high == low)
                System.out.println(low);
            if(arr[mid]>k){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
    }
}