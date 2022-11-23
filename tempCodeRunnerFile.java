import java.util.ArrayList;
public class tempCodeRunnerFile {

    public static void main( String args[] ) {
        int dec = 161;
        // converting to binary and representing it in a string
       
        String bin = Integer.toBinaryString(dec);
        System.out.println(bin);
        int n = bin.length();
        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);
        char a = bin.charAt(2);
        for (int i = 0; i < n; i++) {
            if(bin.charAt(i) == 1){
                arrlist.add(i+1);
            }
        }
        System.out.println(a);

    }
}
