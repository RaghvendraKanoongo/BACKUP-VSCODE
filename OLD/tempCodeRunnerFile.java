import java.util.HashMap;

// package OLD;

/**
 * tempCodeRunnerFile
 */
public class tempCodeRunnerFile {

	public static void main(String[] args) {
		int arr[] = {18,6,24,1};
		HashMap map1 = new HashMap<>();
		HashMap map2 = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if(map1.contains(arr[i]))
		}

	}
	long hcf(int n1, int n2)
	{
    	if (n2 != 0)
        	return hcf(n2, n1 % n2);
    	else
        	return n1;
	}
}