import java.util.Arrays;
// package Problem_Solving_2;
public class OddIsEqualToEven {
    public static void main(String[] args) {
        System.out.println("babaji");
        System.out.println(solve(new int[] {8,7,2,15,3}));
    }
    
    static int solve(int[] arr) { 

        int k = 0;
        if(arr.length%2 != 0)
            k++;
        int[] preEven = new int[arr.length/2+k];
        int[] preOdd = new int[arr.length/2];
        int e = 0;
        int o = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            
            if(flag == false){
                if(e == 0)
                    preEven[e] = arr[i];
                else    
                    preEven[e] = arr[i]+preEven[e-1];
                flag = !flag;
                e++;
            }
            else{
                if(o == 0)
                    preOdd[o] = arr[i];
                else 
                    preOdd[o] = arr[i] + preOdd[o-1];
                flag = !flag;
                o++;
            }
        }
        System.out.println(Arrays.toString(preOdd));
        int sumEven = 0;
        int sumOdd = 0;
        flag = false;
        for (int i = 1; i < arr.length-1; i++) {
            sumEven = preEven[i/2];
            sumOdd = preOdd[i/2];
        }
        return 0;  
    }
}