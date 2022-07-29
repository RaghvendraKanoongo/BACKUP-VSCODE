import java.util.HashSet;

public class Arithmetic {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {4,14,8,2,12,10,6};
        int min = Integer.MAX_VALUE;
        int d = 0;
        int nextMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
            min = min>arr[i]?arr[i]:min;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != min)
                nextMin = arr[i]<nextMin? arr[i]:nextMin;
        }
       

        d = nextMin-min;
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(min+((i)*d))){
                System.out.println(i);
                continue;
            }
            else {
                System.out.println("DIKKAT");
               System.out.println(false);
               break;
            }
        }
        System.out.println(true);
    }
    
}