public class DivisibilityBy8 {
    public static void main(String[] args) {
        System.out.println("babaji");
        System.out.println(solve("64"));
    }
    static public int solve (String str) {
        
        if(str.length()>3){
            int a = Integer.parseInt(str.substring(str.length()-3, str.length()));
            if(a%8 == 0)
                return 1;
            return 0;
        }
        
        else{
            int a = Integer.parseInt(str);
            if(a%8 == 0)
                return 1;
            return 0;
        }
    }
}