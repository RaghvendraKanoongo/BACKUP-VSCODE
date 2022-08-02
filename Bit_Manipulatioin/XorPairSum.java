// package Bit_Manipulatioin;

public class XorPairSum {

    public static void main(String[] args) {
        String s = "JaiMataDi";
        System.out.println(solve(s));
    }

    static String solve(String s){
        if(s.length() == 1){
            return "";
        }
        return solve(""+solve(s.substring(1))+s.charAt(0));

    }
}
