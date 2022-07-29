// package Prime;

public class CheckPrime {
    
    public static void main(String[] args) {
        System.out.println("babaji");
        isPrime(36);
    }
    static boolean isPrime(int n){
        if(n == 1)  return false;
        int count = 0;
        for (int i = 2; i*i <= n ; i++) {

            if(n%i == 0){
                count +=2;
                
            }
            if(i*i == n){
                count--;
            }
        }
        System.out.println("multiples are: "+ count);
        return count == 0?true:false;
    }
    //tc O(sqrt N)
    //sc O(1)
}
