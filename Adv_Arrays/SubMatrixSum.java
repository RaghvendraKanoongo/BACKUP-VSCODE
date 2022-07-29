
// package Adv_Arrays;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * SubMatrixSum
 */
public class SubMatrixSum {
    public static void main(String[] args) {
        System.out.println("babaji");
        ArrayList <ArrayList<Integer>> arr = new ArrayList<>();
        
        arr.add(new ArrayList<>(Arrays.asList(1,2,3)));
        arr.add(new ArrayList<>(Arrays.asList(4,5,6)));
        arr.add(new ArrayList<>(Arrays.asList(7,8,9)));
        
       
        ArrayList <Integer> B = new ArrayList<>();
        ArrayList <Integer> C = new ArrayList<>();
        ArrayList <Integer> D = new ArrayList<>();
        ArrayList <Integer> E = new ArrayList<>();
        
        B.add(1);
        B.add(2);
        C.add(1);
        C.add(2);
        D.add(2);
        D.add(3);
        E.add(2);
        E.add(3);
        System.out.println(solve(arr, B, C, D, E));

    }
    static int solve(ArrayList<ArrayList<Integer>> arr, ArrayList<Integer> B, ArrayList<Integer> C, ArrayList<Integer> D, ArrayList<Integer> E){

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(0).size(); j++) {
                if(i == 0)
                    continue;
                else 
                    arr.get(i).set(j,arr.get(i-1).get(j)+arr.get(i).get(j));
            }
        }
        
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(0).size(); j++) {
                if(j == 0){
                    sum += arr.get(i).get(j);
                    continue;
                }
                else {
                    arr.get(i).set(j,arr.get(i).get(j)+arr.get(i).get(j-1));
                    sum += arr.get(i).get(j);
                }
            }
        }

        int ans = 0;
        ArrayList<Integer> result = new ArrayList<Integer>(B.size());
        for(int i = 0; i<B.size(); i++){

            int b,c,d,e;
            b = B.get(i)-1;
            c = C.get(i)-1;
            d = D.get(i)-1;
            e = E.get(i)-1;
            ans = 0;

            if(b == 0 && c == 0){
                ans = arr.get(d).get(e);
            }
            if(b == 0 && c>0){
                ans = arr.get(d).get(e) - arr.get(d).get(c-1);
            }

            if(b>0 && c == 0){
                ans = arr.get(d).get(e) - arr.get(b-1).get(e);
            }
            else if(b>0 && c>0) {
                ans = arr.get(d).get(e) - arr.get(b-1).get(e) - arr.get(d).get(c-1) + arr.get(b-1).get(c-1);
            }
            result.add(ans);
        }
        return ans;
    }   
        
}