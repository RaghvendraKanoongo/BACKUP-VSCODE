// package Bit_Manipulatioin;

public class XorPairSum {

    public static void main(String[] args) {
        String s = "aJ";
        System.out.println(solve(s));
    }

    static String solve(String s){
        if(s.length() == 1){
            return ""+s.charAt(0);
        } 
        return solve(""+solve(s.substring(1))+s.charAt(1));
    }
}
