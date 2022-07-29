// package Prime;


//sieve of eratosthenes
//sieve of eratosthenes
//sieve of eratosthenes
//sieve of eratosthenes
//sieve of eratosthenes
public class CountPrimeForNElements {
    public static void main(String[] args) {
        
        System.out.println("babaji");
        System.out.println(countPrimes(20));
    }

    static int countPrimes(int n){
        
        
        boolean[] arr = new boolean[n+1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }
        arr[0] = false;
        arr[1] = false;
        for (int i = 2; i*i<=n /* i < n/2 */; i++) {
            if(arr[i] == true){
                for (int j = i*i/*j = j+i */; j < arr.length; j+=i) {
                    arr[j] = false;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == true) {
                count++;
                System.out.println(i);
            }
        }
        return count;
    }
    // TC = O()
}
