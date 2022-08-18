/**
 * tempCodeRunnerFile
 */
// package vs_code;

public class tempCodeRunnerFile {

    public static void main(String[] args) {
        System.out.println(h(1, 2));
        int x = 1;
        int[][] arr = {{12,21},{13,54},{52,63}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                x = x+arr[i][j];
            }
        }
        System.out.println(x);
    }
    static int h(int a, int b){
         a = 9;
         b = 11;
        if(b%a < a){
            {
                b = b >> 1;
                return a;
            }
        }
        else if(a%b<b){
            {
                b = b << 1;
                return b;
            }   
        }
        else  
        return a%b;
    }
}