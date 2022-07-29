import java.util.ArrayList;

public class WorstQuestionEver {
    
    static ArrayList<Integer> finalArr = new ArrayList<>();
    public static void main(String[] args) {
        int[] arr1 = {32,54};
        int[] arr2 = {11,33,44};
        solve(arr1, arr2);
        System.out.println(finalArr);
    }
    static void solve(int[] arr1, int[] arr2){

        int i = 0;
        int j = 0;
        //{32,54}
        //{11,33,44}
        while (i != arr1.length || j != arr2.length) {

            if((j == arr2.length || arr1[i] < arr2[j]) && i < arr1.length){
                finalArr.add(arr1[i]);
                i++;
            }
            else if((i == arr1.length || arr1[i] > arr2[j]) && j < arr2.length){
                finalArr.add(arr2[j]);
                j++;
            }
        }
    System.out.println(finalArr);

    }
    
}
