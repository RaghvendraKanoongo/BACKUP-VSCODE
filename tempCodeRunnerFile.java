import java.util.ArrayList;
public class tempCodeRunnerFile {

    public static void main( String args[] ) {
        int dec = 161;
        String bin = Integer.toBinaryString(dec);
        System.out.println(bin);
        int n = bin.length();
        System.out.println("here");
        System.out.println(13&4);
        ArrayList<Integer> arrlist = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            char a = bin.charAt(i);
            if(a == '1'){  
                arrlist.add(i+1);
            }
        }
        int x = arrlist.size();
        arrlist.add(0,x);
        System.out.println(arrlist);
    }
}
