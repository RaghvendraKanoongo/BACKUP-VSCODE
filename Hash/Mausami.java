import java.util.*;

public class Mausami {

    public static void main(String[] args) {

        String a = "ebbq";
        String b = "qdoqcpbdbqcecdoqcpebqpebbabqdpepcpbqbepbabocpc"; // wait 5 min okie
        for (char i = 0; i < b.length(); i++) {
            System.out.println(b.charAt(i));
        }
    }

    static int solve(String a, String b) {

        HashMap<Character, Integer> Amap = new HashMap<>();
        HashMap<Character, Integer> Bmap = new HashMap<>();

        

        for (char i = 'a'; i <= 'z'; i++) {
            Amap.put(i, 0);
            Bmap.put(i, 0);
        }

        if (b.length() <= a.length())
            return 0;
        int left = 0, right = 0, count = 0;

        while (left < a.length()) {

            Amap.put(a.charAt(left), Amap.get(a.charAt(left)) + 1);
            Bmap.put(b.charAt(left), Bmap.get(b.charAt(left)) + 1);
            left++;
        }
        left--;

        while (left < b.length()) { // 2- 5 o(b.length() * 26)  // o(b.length() * 26)

            if (same(Amap, Bmap)) {
                count++;
            }

            left++;
            if (left != b.length()) {
                Bmap.put(b.charAt(left), Bmap.get(b.charAt(left)) + 1);
            }
            Bmap.put(b.charAt(right), Bmap.get(b.charAt(right)) - 1);
            right++;
        }
        return count;

    }

    static boolean same(HashMap<Character, Integer> Amap, HashMap<Character, Integer> Bmap) {

        for (char i = 'a'; i <= 'z'; i++) {

            if (Amap.get(i) != Bmap.get(i))//frequancy comparision
                return false;// ek bhi galat hui to false return krdega 
        }

        return true;
    }

    // static int solve(String a, String b) {

    // // vector<int> Ahash(26, 0); // ASCII =
    // // vector<int> Bhash(26, 0);// ASCII =
    // int[] Ahash = new int[26];
    // int[] Bhash = new int[26];
    // int len1 = a.length();
    // int len2 = b.length();
    // // STRING A = "aca" , B = "acava" // permun..
    // if (len1 > len2)
    // return 0;
    // int left = 0, right = 0;

    // while (right < len1) {
    // Ahash[a.charAt(right) - 'a']++; // AMap { {a,2} , {c,1}}
    // Bhash[b.charAt(right) - 'a']++; // BMap {{a,1}, {b,1}, {c,1}}
    // right++;
    // }
    // int count = 0;
    // right--; // 1min

    // // if(s1hash==s2hash)
    // // count++;

    // while (right < len2) // 2 , 9 max(len(a), len(b)) o(len(b)*26)
    // {
    // if (same(Ahash,Bhash))
    // count++; // 1,
    // right++; // 3
    // // unordered_map<char, int>map; for(int i =0;i<26;i++) map.put(i+'a',0);
    // if (right != len2) {
    // Bhash[b.charAt(right) - 'a']+=1; // BMap {{a,0}, {b,2}, {c,1}}
    // }
    // Bhash[b.charAt(left) - 'a']-=1; // BMap {{a,0}, {b,2}, {c,1}}
    // left++; // 1
    // }
    // return count;
    // }

    // static boolean same(int[]Ahash,int[]Bhash) {

    // for(int i = 0;i<26;i++)
    // if(Ahash[i]!=Bhash[i])
    // return false;
    // return true;

    // }
}
