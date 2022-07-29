
public class SortedPermutationRank {
    public static void main(String[] args) {
        String str = "ZCSFLVHXRYJQKWABGT";
        System.out.println(str);
        solve(str);
    }
    static void solve(String str){
        int rank = 0;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            int fact = 1;
            int k = 1;
            for (int j = i+1; j < str.length(); j++) {
                if(str.charAt(i)>str.charAt(j)){
                    count++;
                }
                fact = (fact * k) % 1000003;
                k++;
            }
            rank += (fact * count) % 1000003;
        }
        System.out.println((rank+1)%1000003);
    }
}