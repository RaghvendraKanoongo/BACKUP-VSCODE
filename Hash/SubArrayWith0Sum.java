import java.util.HashSet;

/**
 * ldjsflsd
 */
public class SubArrayWith0Sum{
    static HashSet <Integer> hSet = new HashSet<>();

    public static void main(String[] args) {
        int[] arr = {96, -71, 18, 66, -39, -71, -16, -83, -11, -92, 55, 66, 93, 5, 50, -45, 66, -28, 69, -4, -34, -87, -32, 7, -53, 33, -12, -94, -80, -71, 48, -93, 62};
        System.out.println(solve(arr));
        System.out.println(hSet);
    }
    210 = 110 + b1

    static int solve(int[] arr){
    
        int sum = 0;

        for (int j = 0; j < arr.length; j++) {

            if(j == 0){
                hSet.add(arr[j]);
                sum = arr[j];
            }

            else if(hSet.contains(sum+arr[j]) || sum+arr[j] == 0){
                return 1;
            }

            else {
                sum += arr[j];
                hSet.add(sum);
            }
        }
        return 0;
    }
}