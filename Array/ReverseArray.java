public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {11,22,33,44,55};
        printing(arr);
        System.out.println("now see the change");
        revarr(arr);
        
    }
    static void revarr(int[] arr){
        int length = arr.length-1;
        for (int index = 0; index < arr.length/2; index++) {
            int temp = arr[index];
            arr[index] = arr[length-index];
            arr[length-index] = temp;
        }
        printing(arr);
    }
    static void printing(int[] arr){
        for (int i : arr) {
            System.out.println(i);
        }
    }
}