// package SortingAlgos;

/**
 * tempCodeRunnerFile
 */
public class tempCodeRunnerFile {
	public static void main(String[] args) {
		int[] arr = {,9,7,5,3,6};

	}
	static int[] merge(int[] arr, int s, int m, int e){
        int[] sortedArr = new int[m+e];
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
    }
}