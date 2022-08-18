/**
 * tempCodeRunnerFile
 */
// package vs_code;

public class tempCodeRunnerFile {

    public static void main(String[] args) {
        System.out.println(h(1, 2));
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