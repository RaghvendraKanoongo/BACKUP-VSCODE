import java.util.HashMap;

public class PerfactCards {
    public static void main(String[] args) {
        //System.out.println("hola");
        int[] arr = {6,6};
        //solve(arr);
        System.out.println(solve(arr));
    }

    static public String solve(int[] arr) {

        HashMap <Integer, Integer> map = new HashMap<>();
        int store = 0;

        for (int i = 0; i < arr.length; i++) {
            
            if(map.containsKey(arr[i])){

                map.put(arr[i], map.get(arr[i])+1);
            }
            else if(map.size()<=2){

                map.put(arr[i], 1);
                store = i;
                if(map.size()>2){
                    return "LOSE";
                }
            }
        }

        if(map.size()<2){
            return "LOSE";
        }

        if(map.get(arr[0]) == map.get(arr[store])){
            return "WIN";
        }
        else{
            return "LOSE";
        }
    }
}
