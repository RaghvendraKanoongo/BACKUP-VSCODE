import java.util.Arrays;

class KthSmallestElement{
    public static void main(String[] args) {
        
        int[] arr = {8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92};
        //System.out.println(Arrays.toString(arr));
        System.out.println(kthsmallest(arr, 9));
        
    }
    static int kthsmallest(int[] arr, int b){

        int temp1 = b-1;
        for (int i = 0; i < b; i++) {

            
            int min = Integer.MAX_VALUE;
            int store = 0;
            boolean flag = false;
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if(min>arr[j]){
                    count++;
                    min = arr[j];
                    store = j;
                    flag = true;
                }

                if(j == arr.length-1 && flag){
                    //System.out.println("count = "+ count);
                    //System.out.println(min);
                    int temp = arr[i];
                    arr[i] = arr[store];
                    arr[store] = temp;
                    flag = false;
                }
            }
        }
        System.out.println(arr[temp1]);
        return arr[temp1];
    }
}