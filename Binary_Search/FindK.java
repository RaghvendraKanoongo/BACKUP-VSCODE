//  package Binary_Search;

public class FindK {
    public static void main(String[] args) {
        System.err.println("babaji");
        //           0 1 2 3 4 5 6 7 8 9  10 11
        int[] arr = {2,5,8,10,12,15,18,50,80,90};
                //                      | \ |
        int k = 50;// to find 
        int low = 0;
        int high = arr.length-1;
        int mid = (low+high)/2;//5
        int i = 0;
        while (true) {
            if(high == low){
                System.err.println(low);
                break;
            }
            if(arr [mid]  == k){
                System.err.println(mid);
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
            mid = (low+high)/2; 
        }
        System.out.println(-1);
    }
}