import java.util.*;

public class ColorfulNumber {
    public static void main(String[] args) {
        int a = 238;
        
        System.out.println(solve(a));
        
    }

    static int solve(int A){

        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        while (A != 0) {
            int num = A % 10;
            numbers.add(num);
            A /= 10;
        }
        Collections.reverse(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            int product = 1;
            for (int j = i; j < numbers.size(); j++) {

                product *=  numbers.get(j);
                if(hashSet.contains(product)){
                    return 0;
                }
                else 
                    hashSet.add(product);
            }
        }
        return 1;
    }
}