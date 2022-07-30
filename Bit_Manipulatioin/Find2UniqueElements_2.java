// package Bit_Manipulatioin;

public class Find2UniqueElements_2 {

    // here all the elements are repeating thrice except one element

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 3, 2, 2, 3, 1, 1};
        solve(arr);

    }
    static void solve(int[] arr){
        int ans = 0;
        for (int i = 0; i < 31; i++) {
            int count = 0;
            
            for (int j = 0; j < arr.length; j++) {
                int temp = arr[j];

                if(((temp>>i)&1) == 1){
                    count++;
                }
            }
            
            if(count%3 == 1){
                ans = ans|1<<i;
            }
        }
        System.out.println(ans);
    }
}
