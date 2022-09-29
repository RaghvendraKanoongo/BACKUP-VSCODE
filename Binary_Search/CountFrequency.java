public class CountFrequency {
    public static void main(String[] args) {
        System.out.println("babaji");
    }

    static int[] count(int[] arr, int key){

        int low = 0;
        int high = arr.length-1;
        int mid = (low/2) + (high/2);

        while(true){
            if(arr[mid] == key)
                high = mid;
            else if (arr[mid] < key)
                low = mid;
            if(low+1)
            mid = (low/2) + (high/2);
        }
        return new int[4];
    }
}