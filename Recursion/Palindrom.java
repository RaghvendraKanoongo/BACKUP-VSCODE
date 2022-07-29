public class Palindrom {
    public static void main(String[] args) {

        String str = "nadaan";
       System.out.println(isPalindrom(str, 0, str.length()-1));
    }

    static boolean isPalindrom(String str, int i, int j){

        if(i>j || i == j)
            return true;
        return str.charAt(i) == str.charAt(j) && isPalindrom(str, i+1, j-1);
    }
}
