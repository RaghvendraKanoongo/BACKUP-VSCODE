import java.util.ArrayList;
import java.util.Collections;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        String[] strArr = {"aaaaaaaaaaaaaaaaaaaaaaa",  "aaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        for (int i = 0; i < strArr.length; i++) {
            arr.add(strArr[i]);
        }
        
        longestCommonPrefix(arr);
        System.out.println(longestCommonPrefix(arr));

    }

    static String longestCommonPrefix(ArrayList<String> arr){

        int count = arr.get(0).length();

        for (int i = 0; i < arr.size()-1; i++) {
            int tmepCount = 0;
            int size = arr.get(i+1).length()>count?count:arr.get(i+1).length();
            for (int j = 0; j < size; j++) {
                //System.out.println(j);
                if(arr.get(i).charAt(j) == arr.get(i+1).charAt(j)){
                    tmepCount++;
                }
                else 
                    break;
            }
            count = tmepCount<count?tmepCount:count;
        }
        return arr.get(0).substring(0,count);
    }
}
