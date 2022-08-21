import java.util.HashMap;

// package OLD;

/**
 * tempCodeRunnerFile
 */
public class tempCodeRunnerFile {

	public static void main(String[] args) {
		int arr[] = {18,6,24,1,5,7,9};
		HashMap<Integer,Integer> map1 = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if(map1.containsKey(arr[i]))
				continue;
			else
				map1.put(arr[i], 1);
		}
		HashMap<Integer,Integer> map2 = new HashMap<>();
		int count = 0;
		for (int i = 0; i < arr.length-1; i++) {
			int tempHcf = arr[i];
			for (int j = i+1; j < arr.length; j++) {
				tempHcf = hcf(tempHcf,arr[j]);
				if(map2.containsKey(tempHcf)){
					continue;
				}
				else
					map2.put(tempHcf, 1);
			}
		}
	}
	static int hcf(int n1, int n2)
	{
    	if (n2 != 0)
        	return hcf(n2, n1 % n2);
    	else
        	return n1;
	}
}