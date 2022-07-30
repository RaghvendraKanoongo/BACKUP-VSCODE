// package Bit_Manipulatioin;

public class Find2UniqueElements_3 {
    public static void main(String[] args) {
        System.out.println("babaji");
        int[] arr = {1,2,3,4,6,2,1,3,4,5};
        System.out.println(arr[2]<<1);
        // solve(arr);
    }
    static void solve(int[] arr){
        int xor = 0, xor1 = 0, xor2 = 0;

        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        System.out.println(xor);
        for (int i = 0; i < 31; i++) {
            
        }
    }
    
    
}
