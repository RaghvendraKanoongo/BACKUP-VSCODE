package Problem_Solving_6;
// package vs_code.Problem_Solving_6;
import java.util.*;




public class DuplicateRows {
    public static void main(String[] args) {
        System.out.println("babaji");
        int[][] arr = {{1, 1, 1, 0},
                       {0, 0, 0, 1},
                       {1, 1, 1, 0},
                       {0, 0, 0, 1},
                       {1, 1, 1, 0},
                       {0, 0, 0, 1}};

        System.out.println(Arrays.toString(solve(arr)));
    }
    
    static int[] solve(int[][] arr){

        int[] arr1 = new int[arr.length];
        int k = 0;
        

        HashSet <String> set = new HashSet<>();
        
        for (int i = 0; i < arr.length; i++) {
            String s1 = "";
            int row = 1;
            for (int j = 0; j < arr[0].length; j++) {
                s1 += ""+arr[i][j];
            }
            if(set.contains(s1)){
                arr1[k] = i;
                k++;
            }
            else    
                set.add(s1);
            row++;
        }
        return arr1;
    }

    // public static void main(String[] args) {
    //     System.out.println("babaji");

    //     ArrayList<String> myList = new ArrayList<String>(
    //     Arrays.asList("One", "Two", "Two"));
    //     //print the ArrayList
    //    // System.out.println("List contents:"+myList);

    //     ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
    //     arr.add(0, new ArrayList<>(Arrays.asList(1, 1, 1, 0)));
    //     arr.add(1, new ArrayList<>(Arrays.asList(0, 0, 0, 1)));
    //     arr.add(2, new ArrayList<>(Arrays.asList(1, 1, 1, 0)));
    //     arr.add(3, new ArrayList<>(Arrays.asList(0, 0, 0, 1)));
    //     arr.add(4, new ArrayList<>(Arrays.asList(0, 0, 0, 1)));
    //     //System.out.println(arr);
    //     System.out.println(solve(arr));
    // }
    
    //    static ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> matrix) {
    
    //         ArrayList<Integer> ans = new ArrayList<>();
    //         HashMap<String, Boolean> map = new HashMap<>();
    //         int row = 1;
    //         for (ArrayList<Integer> list : matrix) {
    //             String sum = "";
    //             for (Integer it : list) {
    
    //                 sum += Integer.toString(it);
    //             }
    //             if (map.containsKey(sum)) {
    //                 ans.add(row);
    //             } else
    //                 map.put(sum, true);
    //             row++;
    //         }
    //         return ans;
    //     }

    
}
