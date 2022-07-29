

public class PalindromeInteger {
    public static void main(String[] args) {
        System.out.println("bai bhai");
       System.out.println(isPalindrome(2147447412));
        
    }
    static int isPalindrome(int A){
       String str = Integer.toString(A);
       System.out.println(str);
       int start = 0;
       int end = str.length()-1;
       while(start<=end){
           if(str.charAt(start) == str.charAt(end)){
               start++;
               end--;
           }
           else 
            return 0;
       }
       return 1;
    }
}
