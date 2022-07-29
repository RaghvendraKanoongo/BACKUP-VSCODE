
public class Main {
    public static void main(String[] args) {
        int n = 203;
        int result = 0;
        System.out.println("bhia bhia");
        for(int i = n;i>0;i/=10){
            result += ((i%10)*(i%10)*(i%10));
            
        }
        System.out.println(result);
    }
}
