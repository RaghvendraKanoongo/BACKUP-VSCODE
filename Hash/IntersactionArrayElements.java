import java.util.HashMap;

public class IntersactionArrayElements {
    public static void main(String[] args) {
        int[] arr1 = {22,11,44,55,33,88,99, 99};
        int[] arr2 = {99, 77, 3, 55,22,13,13,13};

        HashMap<Integer, Integer> one = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            one.put(arr1[i], 1);
        }

        for (int i = 0; i < arr2.length; i++) {
            if(one.containsKey(arr2[i])){
                one.put(arr2[i], one.get(arr2[i])+1);
            }
        }
        System.out.println(one);
    }
}
