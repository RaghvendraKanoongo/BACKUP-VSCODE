import java.util.concurrent.ForkJoinPool;

public abstract class CountOccurrences {
    public static void main(String[] args) {
        System.out.println(solve("bobob"));
    }
    static int solve(String str){
        
        int count = 0;
        
        for (int i = 0; i < str.length()-2; i++) {
            if(str.substring(i,i+3).contains("bob")){
                count++;
            }
        }
        return count;
    }
}
