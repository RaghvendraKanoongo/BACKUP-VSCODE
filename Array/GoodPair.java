import java.util.ArrayList;
import java.util.HashSet;

public class GoodPair {
    public static void main(String[] args) {
        System.out.println("babaji");
        ArrayList<Integer> arr = new ArrayList<>();
        int[] array = {1,2,4};
        // for (int i = 0; i < array.length; i++) {
        //     arr.add(array[i]);
        // }
        System.out.println(solve(array, 4));
    }
    // static int solve(ArrayList<Integer> arr, int B) {

    //     for (int i = 0; i < arr.size(); i++) {
    //         for (int j = i+1; j < arr.size(); j++) {
    //             if(arr.get(i)+arr.get(j) == B)
    //                 return 1;
    //         }
    //     }
    //     return 0;
    // }

    //using hashing
    static int solve(int[] arr, int b){
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(b-arr[i]))
                return 1;
        }
        return 0;
    }
}
