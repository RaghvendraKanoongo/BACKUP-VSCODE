public class SumOfSetBits {
    public static void main(String[] args) {
        System.out.println(solve(1000000000));
    }
    public static long solve(int n) {
    
        int mod = 1000000000 + 7;
        int ans = 0;
        while (n > 0) {

            int x = 0;
            while ((1 << (x)) <= n) {
                x++;
            }
            x--;
            ans += ((((1 << (x - 1))) * (x)) + (n - ((1 << x)) + 1));
            n = (n- (1 << x));
        }
        return ans;
    }
}