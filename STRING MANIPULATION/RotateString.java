public class RotateString {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("scaler");
        solve(str,2);

    }
    static StringBuffer solve(StringBuffer str, int b){

        b %=str.length();
        b = str.length()-b;
      String s1 =  str.substring(0,b);
      String s2 = str.substring(b,str.length());
      System.out.println(s2+""+s1);
      return str;
    }
}