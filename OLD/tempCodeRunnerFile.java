// package OLD;

/**
 * tempCodeRunnerFile
 */
public class tempCodeRunnerFile {

	public static void main(String[] args) {
		System.out.println("babaji");
		int[] arr = {1,1,1,3};
		int countEven = 0;
        int countOdd = 0;
        for(int i = 0;i<arr.length; i++){
            
            if(arr[i]%2 == 0){
                countEven++;
            }
            else 
                countOdd++;
        }
        if(countOdd+countEven%2 == 1){
            System.out.println(false);
        }
        else if(countEven%2 == 0 && countOdd %2 == 0){
            
            System.out.println(false);
        }
        else 
		System.out.println(false);

	}
}