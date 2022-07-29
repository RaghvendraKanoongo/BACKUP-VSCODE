import java.util.Arrays;
public class RearrangeTheArray {
    public static void main(String[] args) {
        int[] arr = {3,2,0,1 };
        solve(arr);
    }
    static void solve(int[] arr) {
        int n = arr.length;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= n;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] += arr[arr[i]/4]/4;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= n;
        }
        System.out.println(Arrays.toString(arr));
    }
}