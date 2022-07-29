import java.util.ArrayList;

public class PickFromBothSides {
    public static void main(String[] args) {
        System.out.println("babaji");
        ArrayList<Integer> arr = new ArrayList<>();
        int[] array = {-2,100,23,-5,21,45,67,3};
            for (int i = 0; i < array.length; i++) {
                arr.add(array[i]);
            }
        System.out.println(solve(arr, 4));
    }

     static int solve(ArrayList<Integer> arr, int i) {

        int sum = 0;
        int tempSum = 0;
        for (int j = 0; j < i; j++) {
            sum += arr.get(j);
        }
        System.out.println(sum);
        tempSum = sum;
        int l = i-1;
        int r = arr.size()-1;
        for (int j = 0; j < i; j++) {
            
            tempSum = tempSum - arr.get(l) + arr.get(r);
            l--;
            r--;
            sum = tempSum>sum?tempSum:sum;
        }
        return sum;
    }

}
