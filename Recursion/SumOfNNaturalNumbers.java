public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("rama");
        System.out.println(solve(15));
    }

    static int solve(int num){
        if(num == 1)
            return 1;
        else 
            return solve(num-1)*num;
    }
}