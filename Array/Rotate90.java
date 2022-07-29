// package Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Rotate90 {
    public static void main(String[] args) {
        int[][] arr = { {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        ArrayList <ArrayList<Integer>> arr1 = new ArrayList<ArrayList<Integer>>();
        // arr1.get(0).set(1, 20);
        System.out.println(arr1.size());
        arr1.add( new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
        arr1.add( new ArrayList<Integer>(Arrays.asList(5,6,7,8)));
        arr1.add( new ArrayList<Integer>(Arrays.asList(9,10,11,12)));
        arr1.add( new ArrayList<Integer>(Arrays.asList(13,14,15,16)));
        
        // arr1.get(1).addAll(Arrays.asList(5,6,7,8));
        // arr1.get(2).addAll(Arrays.asList(9,10,11,12));
        // arr1.get(3).addAll(Arrays.asList(13,14,15,16));
        rotate1(arr1);

       // int[][] arr2 = rotate(arr);
      //  print(arr);
        //print(arr2);

    }
    static public void rotate1(ArrayList<ArrayList<Integer>> a) {
        ArrayList<ArrayList<Integer>> finalArr = new ArrayList<ArrayList<Integer>>();
        finalArr.add( new ArrayList<Integer>(Arrays.asList(1,2,3,4)));
        finalArr.add( new ArrayList<Integer>(Arrays.asList(5,6,7,8)));
        finalArr.add( new ArrayList<Integer>(Arrays.asList(9,10,11,12)));
        finalArr.add( new ArrayList<Integer>(Arrays.asList(13,14,15,16)));
        for(int i = 0; i<a.size(); i++){
            for(int j = 0; j<a.size();j++){
                finalArr.get(j).set(a.size()-1-i,a.get(i).get(j));
            }
        }
        a = finalArr;
        System.out.println(a);
	}

    static void print(int[][] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    static int[][] rotate(int[][] arr){
        int[][] arr1 = new int[arr.length][arr.length];
        int k = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                arr1[j][k] = arr[i][j];
            }
            k++;
        }
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr[i][j] = arr1[i][j];
            }
        }
        return arr;
    }
}


/**
 
public class Solution {

    public int[][] solve(int[][] arr) {
        int[][] arr1 = new int[arr.length][arr.length];
        int k = 0;

        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                arr1[j][k] = arr[i][j];
            }
            k++;
        }
        return arr1;
    }
}
 */