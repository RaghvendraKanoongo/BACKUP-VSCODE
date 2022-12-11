import java.util.ArrayList;
import java.util.List;

public class Temp {

	static ArrayList<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		String str = new String();
        pGenerator(str, 3, 3);
	}
    
    public static void pGenerator(String str, int oCount,int cCount){

        if(oCount == 1){
            return;
        }
        if(cCount == 1){
            list.add(str);
            return;
        }
        pGenerator(str.add("("), oCount-1,cCount);
        pGenerator(str.add(')'), oCount,cCount-1);
    }
}