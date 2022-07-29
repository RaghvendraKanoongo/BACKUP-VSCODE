/**
 * tempCodeRunnerFile
 */
public class tempCodeRunnerFile {
	public static void main(String[] args) {
		int[] arr = {11,7,2,4};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			min = arr[i]<min?arr[i]:min;
			max = arr[i]>max?arr[i]:max;
		}
		int count = arr.length-2;
		for (int i = 1; i < arr.length-1; i++) {
			if(arr[i] == max || arr[i] == min){
				count --;
			}
		}
	}
}