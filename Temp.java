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
		if(oCount == 0){
			return;
		}

		else{
			list.add(str);
			return;
		}

		
    }
}