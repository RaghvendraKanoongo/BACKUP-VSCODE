import java.util.ArrayList;
import java.util.Arrays;

public class  BeggarsOutsideTemple {
    public static void main(String[] args) {
        System.out.println("babaji");
        //[[1, 2, 10], [2, 3, 20], [2, 5, 25]]
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        arr.add(0, new ArrayList<>(Arrays.asList(1,2,10)));
        arr.add(1, new ArrayList<>(Arrays.asList(2,3,20)));
        arr.add(2, new ArrayList<>(Arrays.asList(2,5,25)));
        System.out.println(arr);
        //solve(5, arr);
    }
    
    static ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> arr) {
        ArrayList<Integer> finalArr= new ArrayList<>();
        for (int index = 0; index < A; index++) {
            finalArr.add(0);
        }
        for (int k = 0; k < arr.size(); k++) {
            // finalArr.set(index, element)
            finalArr.set((arr.get(k).get(0))-1, finalArr.get((arr.get(k).get(0))-1) + arr.get(k).get(2));
            if(arr.get(k).get(1)-1 < A-1){
                finalArr.set(arr.get(k).get(1), finalArr.get(arr.get(k).get(1)) + (-1 * arr.get(k).get(2)));
            }
        }
        for (int i = 1; i < finalArr.size(); i++) {
            finalArr.set(i, finalArr.get(i-1)+finalArr.get(i));
        }
        return finalArr;
    } 

}
