public class CountFrequency {
    public static void main(String[] args) {
        System.out.println("babaji");
    }

    static int[] count(int[] arr, int key){

        int low = 0;
        int high = arr.length-1;
        int mid = (low/2) + (high/2);
        int start = 0;

        if(arr[low] == key);
            start = low;
            
        while(true){
            if(arr[mid] == key)
                high = mid;
            else if (arr[mid] < key)
                low = mid;
            else if(arr[mid] > key)
                high = mid;
            if(low+1 == high){
                start = high;
                break;
            }
            mid = (low/2) + (high/2);
        }

        return new int[4];
    }
}