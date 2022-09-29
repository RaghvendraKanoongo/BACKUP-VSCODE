import java.util.Arrays;

public class CountFrequency {
    public static void main(String[] args) {
        System.out.println("babaji");
        int[] arr = {1,4,4};
        System.out.println(Arrays.toString(count(arr, 4)));
    }

    static int[] count(int[] arr, int key){

        int low = 0;
        int high = arr.length-1;
        int mid = (low/2) + (high/2);
        int start = 0;
        int end = arr.length-1;

        if(arr[low]<)
        if(arr[low] == key)
            start = low;
        else{

            while(true){
                if(arr[mid] == key)
                    high = mid;
                else if (arr[mid] < key)
                    low = mid;
                else if(arr[mid] > key)
                    high = mid;
                if(low+1 == mid || low+1 == high){
                    start = low+1;
                    break;
                }
                mid = (low+high)/2;
            }

            low = 0;
            high = arr.length-1;
            mid = (low/2) + (high/2);
            if(arr[end] == key){
                
            }
            else{
                while (true) {
                    if(low+1 == high){
                        end = low;
                        break;
                    }

                    if(arr[mid]<=key){
                        low = mid;
                    }
                    else if(arr[mid]>key){
                        high = mid;
                    }
                    mid = (low+high)/2;
                }
            }
        }
        int[] finalArr = {start,end};
        return finalArr;
    }
}