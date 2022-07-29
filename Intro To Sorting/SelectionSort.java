import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {22,11,33,44,3322,44,55,66,77,66,5,4,333,22,456,7,4,69,322,2,11,8};
        selectionSort(arr);
    }
    static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int tempMin = Integer.MAX_VALUE;
            int store = 0;
            for (int j = i; j < arr.length; j++) {
                
                if(tempMin>arr[j]){
                    tempMin = arr[j]; 
                    store = j;
                }
                if(j == arr.length-1){
                    arr[store] = arr[i];
                    arr[i] = tempMin;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
