import java.util.ArrayList;
import java.util.List;

public class Temp {

	static ArrayList<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		String str = new String();
        pGenerator(str, 3,3);
		System.out.println(list);
	}

    public static void pGenerator(String str, int oCount,int cCount){
		if(oCount > 0){
			// str = str+"("; 
	    	pGenerator(str+"(", oCount-1, cCount);
		}
		if(cCount > 0){
			// str = str+")";
			pGenerator(str+")", oCount, cCount-1);
		}
		if(cCount == 0){
			list.add(str);
			return;
		}
		if(oCount == 0){
			return;
		}
    }
}