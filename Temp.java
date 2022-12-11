import java.util.ArrayList;
import java.util.List;

public class Temp {

	static ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args) {
		String str = new String();
        pGenerator(str, 1,1, 2);
		System.out.println(list);

	}

    public static void pGenerator(String str, int oCount,int cCount, int n){
		if(oCount > 0){
			// str = str+"("; 
	    	pGenerator(str+"(", oCount-1, cCount,n);
		}
		if(cCount > 0){
			// str = str+")";
			pGenerator(str+")", oCount, cCount-1,n);
		}
		if(cCount == 0 && str.length() == n && check(str)){
			list.add(str);
			return;
		}

		if(oCount == 0){
			return;
		}
    }
	public static boolean check(String str){
		int oCount = 0;
		int cCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(')
				oCount++;
			if(str.charAt(i) == ')')
			cCount++;
			if(cCount>oCount)
			return false;
		}
		return true;
	}
}