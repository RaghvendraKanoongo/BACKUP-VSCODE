// package Bit_Manipulatioin;

public class XorPairSum {

    public static void main(String[] args) {
        String s = "civic";
        System.out.println(solve(s));
    }

    static String solve(String s){
        if(s.length() == 1){
            return ""+s.charAt(0);
        } 
        return ""+solve(s.substring(1))+s.charAt(0);
    }
}
