/**
 * tempCodeRunnerFile
 */
package vs_code;

public class tempCodeRunnerFile {

    public static void main(String[] args) {
        int v = 200;
        int w = 540;
       System.out.println("babaji");
        for (int i = 0; i < 540; i++) {
            w -= i*4;
            if((w/2)+i == v){
                System.out.println("tw:"+w/2);
                System.out.println("fw:"+i);
            }
        }
    }
}