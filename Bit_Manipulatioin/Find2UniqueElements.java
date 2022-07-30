// package Bit_Manipulatioin;

public class Find2UniqueElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 3, 2, 2, 3, 1, 1};
        int temp = 7;
        int i = 2;
        System.out.println(temp>>i);
        System.out.println(temp);

    }
    static void solve(int[] arr){
        for (int i = 0; i < 31; i++) {
            int count = 0;
            
            for (int j = 0; j < arr.length; j++) {
                int temp = arr[j];

                if(((temp>>i)&1) == 1){
                    count++;
                }
            }
            
            if(count%3 == 1){
                
            }
            
        }
    }
    
}
