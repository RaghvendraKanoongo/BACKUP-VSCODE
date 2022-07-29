import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ChangeCharacter {
    public static void main(String[] args) {
        System.out.println("hola");
        solve("aabafcfcdfebf", 3);
    }

    static int solve(String str, int b){

        HashMap<Character,Integer> map =  new HashMap<>();
        int[] arr;
        String tempStr = "";
        char max = ' ';
        int store = 0;
        char min = ' ';
        for (int i = 0; i < str.length(); i++) {
            
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else {
                map.put(str.charAt(i), 1);
                tempStr += ""+str.charAt(i);
            }
        }
        arr = new int[tempStr.length()];
        for (int j = 0; j < tempStr.length(); j++) {
            arr[j] = map.get(tempStr.charAt(j));
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int size = arr.length;
        for (int i = 0; i < arr.length;) {
            if(b == 0 || arr[i] == 0){
                i++;
            }
            else{
                if(b>0){
                    arr[i] -= 1;
                    b--;
                }
                if(arr[i] == 0){
                    size--;
                }
            }
        }
        System.out.println(size);
        return 0;
    }
}