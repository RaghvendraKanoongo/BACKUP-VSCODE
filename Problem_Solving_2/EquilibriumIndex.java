package Problem_Solving_2;
public class EquilibriumIndex {
    public static void main(String[] args) {
        System.out.println("babaji");
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(solve(arr));
    }

    static int solve(int[] arr) {
        int sumL = 0;
        int sumR = 0;
        for (int i = 0; i < arr.length; i++) {
            sumR += arr[i];
            System.out.println(sumR);
        }
        for (int i = 0; i < arr.length; i++) {
            
            sumR -= arr[i];
            if(sumL == sumR){
                return i;
            }
            sumL += arr[i];
        }
        return -1;
    }

}
