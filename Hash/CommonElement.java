import java.util.ArrayList;
import java.util.HashMap;


public class CommonElement {
static int[] store ;
    public static void main(String[] args) {

        int[] arr1 = {22,55,33,11,33,22,33};
        int[] arr2 = {88,99,77,22,11,33,22};
        
        HashMap<Integer,Integer> hash1 = new HashMap<>();
        HashMap<Integer,Integer> hash2 = new HashMap<>();
        printing(arr1);
        printing(arr2);
        countFreq(arr1, hash1);
        countFreq(arr2, hash2);
        countCommon(hash1, hash2, arr1);
        
        
    }

    static void countFreq(int[] arr, HashMap<Integer,Integer> hash){

        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(arr[i])){
                 hash.put(arr[i], hash.get(arr[i])+1);
            }
            else
                hash.put(arr[i],1);
        }
    }

    static void countCommon(HashMap <Integer,Integer> hash1,HashMap <Integer,Integer> hash2, int[] arr){
        int count = 0;
        HashMap<Integer,Integer> temp = new HashMap<>();
        ArrayList <Integer> temp1 = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            
            if(hash1.containsKey(arr[i]) && hash2.containsKey(arr[i])){
                count++;
                if (!temp.containsKey(arr[i])) {
                    int val = hash1.get(arr[i])<hash2.get(arr[i]) ? ((int) hash1.get(arr[i])) : ((int) hash2.get(arr[i]));
                    temp.put(arr[i], val);
                    for (int j = 0; j < val; j++) {
                        temp1.add(arr[i]);
                    }
                }
            }
        }
        

        System.out.println("here");
        

        store = new int[count];
        store = temp1.stream().mapToInt(i -> i).toArray();
        printing(store);
        
    }

    static void printing(int[] arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}