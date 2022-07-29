// package Arrays1;

import java.util.Arrays;

public class FirstMissingPositiveInteger {
    public static void main(String[] args) {
        System.out.println("babaji");
        int[] arr = {2,4,6,1,1,3,0};
        System.out.println(solve(arr));

    }
    static public int solve(int[] arr){
        //find the first missing integer
        /*                      -- TC, SC :-
         * 1 either use hash map  o(n),o(n)
         * 2 or use sort and find with the help of index o(nlogn), o(n)
         * 3 brute force search n^2 times
         * 4 use the max value possible in the array which is size of the array and all the smaller number should be placed at their own index
         */
        //2,4,6,1,0,3 = [0,6,2,1,4,3]
        //0,1,2,1,4,3,6
        int i = 0;//1
        while (i<arr.length) {//6
            if(arr[i]<arr.length && arr[i] != i && arr[arr[i]] != arr[i]){
                int temp = arr[arr[i]];//6
                arr[arr[i]] = arr[i];//0
                arr[i] = temp;//6
            }
            if(arr[i] == i || arr[i]>=arr.length || arr[arr[i]] == arr[i])
                i++;
            System.out.println(Arrays.toString(arr));
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j)
                return j;
        }
        return 0;
    }
}
