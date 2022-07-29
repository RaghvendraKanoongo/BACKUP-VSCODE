public class BucketSort {
    public static void main(String[] args) {
        String str = "zzyyxxwwvvuuttssrrqqppoonnmmllkkjjiihhggffeeddccbbaa";
        String[] arr = new String[26];
        solve(str);
    }

    static void solve(String str){
        
        int [] arr = new int[26];
        String sortedString = "";
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)-97] += 1;
        }

        for (int i = 0; i < arr.length;) {
            if(arr[i] == 0){
                i++;
            }
            else{
                char ch =(char) (97 + i);
                arr[i] -= 1;
                sortedString += ch;
            }
        }
        System.out.println(sortedString);
    }
}