import java.util.ArrayList;

// package Modular_Arithmetic;

public class RearraneArray {
    public static void main(String[] args) {
        System.out.println("babaji");
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(1);
        arr.add(0);
        arr.add(2);
        arrange(arr);
    }

    // arr[i] = arr[arr[i]]

    static public void arrange(ArrayList<Integer> a) {
        int n = a.size();
        for (int i = 0; i < n; i++) {
            a.set(i, a.get(i)*n);
        }
        for (int i = 0; i < n; i++) {
            a.set(i,(a.get(a.get(i)/5)/5)+a.get(i));
        }
        for (int i = 0; i < n; i++) {
             a.set(i, a.get(i)%n);
        }
        System.out.println(a);
        
        
	}
}
