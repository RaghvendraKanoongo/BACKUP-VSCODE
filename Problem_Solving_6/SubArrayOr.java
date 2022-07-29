

public class SubArrayOr {
    public static void main(String[] args) {
        System.out.println("babaji");
        int[] arr = {0,0,0,0,1,1};
        solve(arr);
    }

     static int solve(int[] arr) {
        int totalSubArr = (arr.length*(arr.length+1))/2;
        int totalZeroSubArr = 0;
        int temp = 0;

        for (int i = 0; i < arr.length;) {
            // 1,1,0,0,1,0,1,0
            while (i<arr.length && arr[i] == 0) {
                temp++;
                i++;
            }
            totalZeroSubArr += (temp*(temp+1))/2;
            temp = 0;
            i++;
        }
        System.out.println(totalSubArr - totalZeroSubArr);
        return 1;
    }

}
