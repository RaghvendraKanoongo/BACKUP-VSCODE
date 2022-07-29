public class SortTheUnsortedArray {
    public static void main(String[] args) {

        int[] arr = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        
        System.out.println(solve(arr));
    }

    static int  solve(int[] arr){

        int temp1 = 0;
        int temp2 = 0;
        boolean flag1 = false;
        boolean flag2 = false;
        int min_index = 0;
        int max_index = 0;

        for (int i = 0; i<arr.length-1; i++) {
            
            if(flag1){
                if(arr[i]<arr[temp1]){
                    temp1 = i;
                }
            }
            if(!flag1){
                if(arr[i]>arr[i+1]){
                    temp1 = i+1;
                    flag1 = !flag1;
                }
            }

            if (flag2){
                if(arr[temp2]<arr[(arr.length-1)-i]){
                    temp2 = (arr.length-1)-i;
                }
            }
            if(!flag2){
                if(arr[(arr.length-1)-i] < arr[(arr.length-1)-i-1]){
                    temp2 = (arr.length-1)-i-1;
                    flag2 = !flag2;
                }
            }

            
        }
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[temp1]<arr[i] && flag1){
                min_index = i;
                flag1 = !flag1;
            }
            if(arr[temp2]>arr[(arr.length-1)-i] && flag2){
                
                max_index = (arr.length-1)-i;
                flag2 = !flag2;
            }
        }

        return max_index-min_index+1;
    }
}