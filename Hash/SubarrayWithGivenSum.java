import java.util.ArrayList;
import java.util.HashMap;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {10, 15, 15, 20, 30, -20, 30, 50, -30, 10};
        //          {10, 25, 40, 60, 90,  70, 110, 150,}
        int B = 110;
        solve(arr, B);
    }

    static void solve(int[] arr, int b){

        ArrayList <Pairs> storeArr = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            
            if(i == 0){
                sum = arr[i];
                map.put(sum, i);
            }
            else{
                sum += arr[i];
                map.put(sum, i);
            }
            if(map.containsKey(sum-b)||map.containsKey(b)){
                Pairs temp = new Pairs();
                if(map.containsKey(b)){
                    temp.i = 0;
                    temp.j = i;
                }
                else{
                    temp.i = map.get(sum-b);
                    temp.j = i;
                }
                storeArr.add(temp);
            }
            
        }
        System.out.println(storeArr.get(0).i+" till "+storeArr.get(0).j);
    }
}

class Pairs{
    int i;
    int j;
}

