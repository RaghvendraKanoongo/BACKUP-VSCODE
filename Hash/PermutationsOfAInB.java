import java.util.HashMap;
// import java.util.ArrayList;

// public class PermutationsOfAInB {
//     public static void main(String[] args) {

//         StringBuffer a = new StringBuffer("abc");
//         StringBuffer b = new StringBuffer("abcbacabc");

//         System.out.println(solve(a, b));
//     }
//     static int solve(StringBuffer a, StringBuffer b) {

//         ArrayList<StringBuffer> permu = new ArrayList<>();
//         Permutation(a , permu, 0);

//         // for(StringBuffer ttt : permu) {
    
//         //     System.out.println(ttt);
//         // }

//         return 1;
//     }
//     // a = {abc};
//     static void Permutation(StringBuffer str , ArrayList<StringBuffer> list, int index)  {

//         if(index>= str.length())    {
//             list.add(str);
//             return;
//         }

//         for (int i = index; i < str.length(); i++) {

//             char temp = str.charAt(i);
//             str.insert(i, str.charAt(index));
//             str.insert(index, temp);
//             // swapping
//             Permutation(str, list, index+1);
//             // again swapping 
//             temp = str.charAt(i);
//             str.insert(i, str.charAt(index));
//             str.insert(index, temp);

//         }
//     }
// }

public class PermutationsOfAInB {

    static HashMap<Character, Integer> mapA = new HashMap<>();
    static HashMap<Character, Integer> tempMap = new HashMap<>();
    static int count = 0;

    public static void main(String[] args) {
        String A = "";
        String B = "";
        System.out.println(B.length());
        hashInsertationMapA(A);
        // hash of A = {{a, 1}, {b,1}, {c,1}};

        // 0 <= 6
        for (int i = 0; i <= B.length() - A.length(); i++) { 
            hashInsertationTempMap(B.substring(i, i + A.length())); 
            check(i, i + A.length(), A, B);
            tempMap.clear();

        }
        System.out.println(count);
    }

    static void check(int from, int to, String A, String B) {
        int tempcount = 0;
        for (int i = from; i < to; i++) {

            if ((tempMap.containsKey(B.charAt(i)) == true && mapA.containsKey(B.charAt(i)) == true)
                    && (tempMap.get(B.charAt(i)) == mapA.get(B.charAt(i)))) {
                // count++;
                tempcount++;
                // bab = 
                //tempMap.put(B.charAt(i), -1);
            }
            //count  = count ;
        }
        if(tempcount==A.length())
            count++;
        return;
    }

    static void hashInsertationTempMap(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (!tempMap.containsKey(str.charAt(i))) {
                tempMap.put(str.charAt(i), 1);
            } else
                tempMap.put(str.charAt(i), tempMap.get(str.charAt(i)) + 1);
        }
    }

    static void hashInsertationMapA(String str) {

        for (int i = 0; i < str.length(); i++) {

            if (!mapA.containsKey(str.charAt(i))) {
                mapA.put(str.charAt(i), 1);
            } else
                mapA.put(str.charAt(i), mapA.get(str.charAt(i)) + 1);
        }
    }

    // for (int j = 0; len <= B.length(); j++) {
    // if (set.contains(B.substring(j, len))){
    // count++;
    // }
    // len++;
    // }
    // ---------------------------------------------------------

    // static void permute(String string, String ans){

    // if(string.length() == 0){

    // }

    // for (int i = 0; i < string.length(); i++) {
    // char ch = string.charAt(i);
    // String left = string.substring(0,i);
    // String right = string.substring(i+1);
    // permute(left+right, ans+ch);
    // }
    // }
}
