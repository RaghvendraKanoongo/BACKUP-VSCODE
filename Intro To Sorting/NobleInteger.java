import java.util.Arrays;

public class NobleInteger { 
    public static void main(String[] args) {

        int[] arr = {-4, -2, 0, -1, -6};
             //Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        System.out.println(solve(arr));
    }

    static int solve(int[] arr){

        for (int i = 0; i < arr.length-1;) {
            if(arr[i] == arr[i+1]){
                i++;
            }
            else if(arr[i] == arr.length-1-i){
                return 1;
            }
            else 
                i++;
        }
        return -1;
    }
    
}
