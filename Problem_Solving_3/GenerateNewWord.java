import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class GenerateNewWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        GenerateNewWord object1 = new GenerateNewWord();
        System.out.println(object1.solve(str1, str2)); 
    }
    
    public String solve(String S, String C){
        HashMap <Character,Integer> map1 = new HashMap<>();
        HashMap <Character,Integer> map2 = new HashMap<>();
        S = S.toLowerCase();
        C = C.toLowerCase();
        for (int i = 0; i < S.length(); i++) {
            
            if(map1.containsKey(S.charAt(i))){
                return "New Language Error";
            }
            else
                map1.put(S.charAt(i), 1);
        }
        for (int i = 0; i < C.length(); i++) {
            if(map2.containsKey(C.charAt(i))){

                 map2.put(C.charAt(i), map2.get(C.charAt(i))+1);
            }
            else
                map2.put(C.charAt(i), 1);
        }

        String finalString = "";
        String numString = "";
        for (int i = 0; i < S.length();) {
            
            if(map2.containsKey(S.charAt(i))){
                int temp = map2.get(S.charAt(i));
                while (temp > 0) {
                    if (S.charAt(i) >= 48 && S.charAt(i) <= 57) {
                        numString += S.charAt(i);
                        temp--;
                    }
                    else {
                        finalString += S.charAt(i);
                        temp--;
                    }
                }
                i++;
            }
            else
                i++;
        }
        finalString += " ";
        char tempArray[] = numString.toCharArray();
        Arrays.sort(tempArray);
        for (int i = numString.length()-1; i >= 0; i--) {
            finalString += tempArray[i]; 
        }
        return finalString;
    }
}