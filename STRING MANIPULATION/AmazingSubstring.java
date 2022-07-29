import java.util.HashSet;

public class AmazingSubstring {
   static  HashSet<Character> set = new HashSet<>();
    public static void main(String[] args) {
        
        System.out.println(solve("pGpEusuCSWEaPOJmamlFAnIBgAJGtcJaMPFTLfUfkQKXeymydQsdWCTyEFjFgbSmknAmKYFHopWceEyCSumTyAFwhrLqQXbWnXSn"));
    }
    static int solve(String str){

        int sum = 0;
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        for (int j = 0; j < vowels.length; j++) {
            set.add(vowels[j]);
        }
        
        for (int i = 0; i < str.length(); i++) {
            if(set.contains(str.charAt(i))){
                sum += str.length()-i;
            }

        }
        return sum;
    }
}
