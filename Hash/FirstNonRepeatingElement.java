import java.util.*;
import java.util.Map.Entry;
public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {22,22,11,33,11,33,33,44,44};
        HashMap<Integer, Integer>  test = new LinkedHashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (test.containsKey(arr[i])){
               test.put(arr[i], test.get(arr[i])+1);//this line is inserting the element after 1st time and test.get() is generating the "VALUE" 
                                                    //from the <KEY, VALUE> set and incrementing it by 1

            }

            else
                test.put(arr[i], 1);// 1st time insertation 
        }

        System.out.println("hola:" + test.get(arr[4]));
        for (Entry <Integer, Integer> i : test.entrySet()) {
            if(i.getValue() == 1){// i.value gives us the "VALUE" of that perticular index 
                System.out.println(i.getKey());
                break;
            }
        }
    }
}
