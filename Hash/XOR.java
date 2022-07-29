import java.util.HashMap;

public class XOR {
    public static void main(String[] args) {
        int[] arr = { 17, 18, 8, 13, 15, 7, 11, 5, 4, 9, 12, 6, 10, 14, 16, 3};
        int key = 4;
        // int[]array2 = {17^4, 18^4};
        
        // arr = {3, 7, 3, 7, 3}
      System.out.println(find(arr, key));

    }
    static int find(int[] arr, int key){
        int count = 0;
        HashMap<Integer, Integer> hMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hMap.put(arr[i], 1);
        }

        for (int i = 0; i < arr.length; i++) {
            if(hMap.containsKey(arr[i]^key) && hMap.get(arr[i]) == 1){
                count++;
                hMap.put(arr[i], hMap.get(arr[i])+1);
                hMap.put(arr[i]^key, hMap.get(arr[i]^key)+1);
            }

        }
        return count;
    }
}