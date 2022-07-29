import java.lang.reflect.Array;
import java.util.ArrayList;

public class ToLower {
    public static void main(String[] args) {
        char c = 65;
        ArrayList<Character> arr = new ArrayList<>();
        char[] ch = {'v', 'c', 'A', 'l', 'e', '+', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
        for (int index = 0; index < ch.length; index++) {
            arr.add(ch[index]);
        }
        if(arr.get(0) == 97){
            System.out.println("it is a");
        }
        System.out.println(arr);
        //System.out.println(ch);
        System.out.println(to_lower(arr));

    }
    static int to_lower(ArrayList<Character> arr) {

        for (int i = 0; i < arr.size(); i++) {
            if(!(arr.get(i)>=97 && arr.get(i)<= 122 || arr.get(i)>=65 && arr.get(i)<= 90)){
                return 0;
            }
        }
        return 1;
    }
}
