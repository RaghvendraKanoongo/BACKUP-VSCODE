import java.util.ArrayList;
import java.util.List;

public class Temp {

	static ArrayList<String> list = new ArrayList<String>();
	public static void main(String[] args) {
		String str = new String();
        pGenerator(str, 3, 3);
		System.out.println(list);
	}
    
    public static void pGenerator(String str, int oCount,int cCount){

		if(cCount == 0 && oCount == 0){
            list.add(str);
            return;
        }

        if(oCount == 0){
			System.out.println(str);
            return;
        }

		if(oCount)
        pGenerator(str+"(", --oCount,cCount);

        pGenerator(str+")", oCount,--cCount);
    }
}