/**
 * ClosestPalindrome
 */
public class ClosestPalindrome {

    public static void main(String[] args) {
        System.out.println(solve("namdfan"));
    }
    static String solve(String str){
        
        int count = 0;
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                count++;
            }
        }
        if(count == 1 || count == 0 && str.length()%2 == 1)
            return "YES";
        else
            return "NO";
    }
}