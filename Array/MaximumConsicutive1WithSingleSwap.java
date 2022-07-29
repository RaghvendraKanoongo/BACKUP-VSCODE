public class MaximumConsicutive1WithSingleSwap{
    
    static int[] arr;
    static int[] left;
    static int[] right;
    static int countOne = 0;
    public static void main(String[] args) {

        //String i = "010100110101";
        // arr = new int[i.length()];
        // left = new int[i.length()];
        // right = new int[i.length()];
        // int n = i.length();
        //int k = Integer.parseInt(i);
        // for (int j = 0; j < arr.length; j++) {
        //     arr[j] = k%10;
        //     k/= 10;
        // }
        int x = 4;
        System.out.println((1<<x-1));
        
       //System.out.println(i);
        // countLeft(arr);
        // countRight(arr);
        // countOne = countOne(arr);
        //System.out.println("Array: ");
        //printing(arr);
        //System.out.println("Left: ");
        //printing(left);
        //System.out.println("Right: ");
        //printing(right);
        //System.out.println(countConsicutiveOne(arr));

    }

    static int countOne(int[] arr){
        int val = 0;
        for (int i = 0; i < arr.length; i++) {
            if (1 == arr[i]){
                val++;
            }
        }
        return val;
    }

    static void countLeft(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0)
                left[i]=0;

            else if (i == 0 && arr[i] == 1)
                left[i] = 1;

            else
                left[i] = left[i-1]+1; 
        }
    }

    static void countRight(int[] arr){
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i] == 0)
                right[i] = 0;

            else if (i == arr.length-1 && arr[i] == 1)
                right[i] = 1;
    
            else 
                right[i] = right[i+1]+1;

        }
    }

    static void printing(int[] arr){
        
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    static int countConsicutiveOne(int[] arr){

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {

            if(i>0 && i<arr.length-1){
                 
                int hold = 0;
                hold = left[i-1] + right[i+1];
                if(arr[i] == 1 ){
                    hold += 1;
                }
                
                else if(arr[i] == 0 && hold < countOne){
                    hold += 1;
                }
                ans = (ans > hold ? ans : hold);
                
            }

            else if (i == 0){
                ans = right[i];
            } 

            else if(i == arr.length-1){
                if(arr[i] == 1){
                    ans = (ans > left[i] ? ans : left[i]);
                }
                else if (right[i-1]+1 < countOne){

                    ans = (ans > left[i]+1 ? ans : left[i]);
                }
            }
        }
        return ans;
    }
}
