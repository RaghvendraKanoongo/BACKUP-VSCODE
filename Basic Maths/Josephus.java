public class Josephus {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = index+1;
        }
        solve(arr);
    }
    private static void solve(int[] arr) {
        int i = 1;
        while (i<arr[arr.length-1]) {
            i <<= 1;
        }
        int n = arr[arr.length-1] - (i>>1);
        int store = 0;
        System.out.println(arr[2*n]);
    }
}