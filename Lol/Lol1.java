// import static java.lang.Integer.MAX_VALUE;
//   package Lol;
import java.util.Arrays;
import java.util.Comparator;
/**
 * Lol
 */
public class Lol1 {



    private static double getMaxValue(int[] wt, int[] val, int capacity)
	{
		ItemValue[] iVal = new ItemValue[wt.length];

		for (int i = 0; i < wt.length; i++) {
			iVal[i] = new ItemValue(wt[i], val[i], i);
		}

		// sorting items by value;
		Arrays.sort(iVal, new Comparator<ItemValue>() {
			@Override
			public int compare(ItemValue o1, ItemValue o2)
			{
				return o2.cost.compareTo(o1.cost);
			}
		});

		double totalValue = 0d;

		for (ItemValue i : iVal) {

			int curWt = (int)i.wt;
			int curVal = (int)i.val;

			if (capacity - curWt >= 0) {
				// this weight can be picked while
				capacity = capacity - curWt;
				totalValue += curVal;
			}
			else {
				// item cant be picked whole
				double fraction
					= ((double)capacity / (double)curWt);
				totalValue += (curVal * fraction);
				capacity
					= (int)(capacity - (curWt * fraction));
				break;
			}
		}

		return totalValue;
	}

	// item value class
	static class ItemValue {
		Double cost;
		double wt, val, ind;

		// item value function
		public ItemValue(int wt, int val, int ind)
		{
			this.wt = wt;
			this.val = val;
			this.ind = ind;
			cost = new Double((double)val / (double)wt);
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		int[] wt = { 6,8,4,10,7,5 };
		int[] val = { 12,24,20,30,27,25 };
		int capacity = 30;

		double maxValue = getMaxValue(wt, val, capacity);

		// Function call
		System.out.println("Maximum value we can obtain = "
						+ maxValue);
	}

    // public static void main(String[] args) {
    //     System.out.println(minimumMoves(4, 7));
    // }


    // static int minimumMoves(int A, int B) {

    //     int moves = 0;
       
    //     while(A>0 && B>0){

    //         int temp = Math.min(A, B);
    //         moves++;
    //         if (temp == A)
    //             B = B - temp;
    //         else if (temp == B)
    //             A = A - temp;
    //     }
    //     return moves;
    // }



    // public static void main(String[] args) {
    //     int[] arr = {-6,6,-6,6,-6,6,-6,6,-6};
    //      System.out.println( solve(9, arr));
    // }
    // public static String solve(int N, int[] arr){
    //     for (int i = 0; i < arr.length; i++) {

    //         int j = 0;
    //         if(i<arr.length-1){
    //              j = i+1;

    //             if(arr[i]+arr[j] != 0){
    //                 return"NO";
    //             }
    //         }
            
    //     }
    //     return "YES";
    // }




    // public static String solve(int N, int[] arr) {
    //     int temp = 0;
    //     int result = 0;
    //     for (int i = 0; i < N; i ++)
    //     {
            
    //         temp=0;
    //         int k = 0;
    //         for (int j = i; j < N; j ++)
    //         {
    //             temp+=arr[j];
    //             k++;
    //             if(k%2 == 0){
    //                 if (temp != 0)
    //                 return "NO";
    //             }
    //         }
    //         temp = 0;
    //         k = 0;
    //     }
    //     return "YES";
    // }


    // public static void main(String[] args) {

    //     System.out.println(0%0);
    //     // System.out.println(pow(2, 12, 100));
    // }
    static public int pow(int x, int n, int mod) {

        int ans = 1;

        if(n == 0)
            return 0;
        while(n>0){
            if((n&1) == 0) {
                x = (x%mod*x%mod)%mod;
                n /= 2;//(12) 6,   3,   1,   
            }
            else {
                ans = (ans%mod * x%mod)%mod;
                n -= 1;
            }
        }
        return ans;
    }
}

/*
 * 1-1
2-3
3-7
4-15
5-31
6-63
7-127
 */