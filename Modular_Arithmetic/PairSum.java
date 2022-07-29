// package Modular_Arithmetic;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.text.html.FormSubmitEvent;

public class PairSum {
    public static void main(String[] args) {
        System.out.println("babaji");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(34);
        list.add(8);
        list.add(40);
        list.add(40);
        list.add(40);
        list.add(16);
        list.add(13);
        list.add(54);
        list.add(87);
        System.out.println(solve(list, 4));
    }
    static public int solve(ArrayList<Integer> list, int k) {

        HashMap <Integer,Integer> map = new HashMap<>(k);
        for (int i = 0; i < list.size(); i++) {
            if(map.containsKey(list.get(i)%k)){
               map.put(list.get(i)%k, map.get(list.get(i)%k)+1);
            }
            else 
                map.put(list.get(i)%k, 1);
        }
        int count = 0;
        int temp = 0;
        temp = map.get(0);
        count = (temp * (temp-1))/2;
        int j = k-1;
        for (int i = 1; i <= j; i++) {
            if(i == j){
                count += (map.get(i)*(map.get(i)-1))/2;
            }
            else {
                count += map.get(i)*map.get(j);
            }
            j--;
        }
        return count;
    }
}
