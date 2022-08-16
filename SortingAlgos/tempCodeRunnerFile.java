import java.util.Arrays;

// package SortingAlgos;

/**
 * tempCodeRunnerFile
 */
public class tempCodeRunnerFile {
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9,2,4,6,8};
		merge(arr, 0, 4, 8);
	}
	static void merge(int[] arr, int s, int m, int e){
        int[] sortedArr = new int[e+1];
        int i = s;
        int j = m+1;
        int k = 0;
        while(i<=m && j<=e){
            if(arr[i]<arr[j]){
                sortedArr[k] = arr[i];
                i++;
                k++;
            }
            else if(arr[i]>arr[j]){
                sortedArr[k] = arr[j];
                j++;
                k++;
            }
            else if(arr[i] == arr[j]){
                sortedArr[k] = arr[i];
                i++;
                j++;
                k++;
            }
        }
        while(i<=m){
            sortedArr[k] = arr[i];
            i++;
        }
        while(j<=e){
            sortedArr[k] = arr[j];
            j++;
        }
		System.out.println(Arrays.toString(sortedArr));
    }
}