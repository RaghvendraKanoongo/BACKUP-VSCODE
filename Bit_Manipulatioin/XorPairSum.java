// package Bit_Manipulatioin;

public class XorPairSum {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        String s = "Raghav";
        int sLen = s.length();
        System.out.println(solve(s));
    }

    static String solve(String s){

        if(s.length() == 1){
            return ""+ s.charAt(0);
        }
        return solve(s.substring(1));

    }
}
