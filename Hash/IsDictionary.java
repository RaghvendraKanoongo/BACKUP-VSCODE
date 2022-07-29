import java.util.HashMap;

public class IsDictionary {

    static HashMap<Character, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        String[] arr = {"hello", "scaler", "interviewbit"};
        String s = "adhbcfegskjlponmirqtxwuvzy";
        System.out.println(solve(arr, s));
    }

    static int solve(String[] arr, String B){

        int value = 0;
        boolean bool = false;
        for (int i = 0; i < B.length(); i++) {
            map.put(B.charAt(i), ++value);
        }

        System.out.println(map);
        for (int i = 0; i < arr.length-1; i++) {
            
          if(check(arr[i], arr[i+1]) == false){
              return 0;
          }
        }
        return 1;
    }

    static boolean check(String s1, String s2){
//                        gold       gola
        int size = s1.length()<s2.length()? s1.length():s2.length();

        for (int i = 0; i <= s1.length(); i++) {
            if(i == size){
                return false;
            }

            else if(map.get(s1.charAt(i)) < map.get(s2.charAt(i)))
                return true;

            else if(map.get(s1.charAt(i)) == map.get(s2.charAt(i)))
                continue;

            else 
                return false;
        }
        return false;
    }

}
