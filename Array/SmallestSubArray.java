public class SmallestSubArray {
    static int min = 0;
    static int max = 0;
    static int minPos = -1;
    static int maxPos = -1;
    static int ans = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int[] arr = { 343, 291, 963, 165, 152 };
        min_max(arr);   
        System.out.println(Answer(arr));
    }
    static int Answer(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] == arr[min]){
                minPos = i;
                if (maxPos != -1){
                    ans = findmin(ans, minPos-maxPos+1);
                }
            }
            else if(arr[i] == arr[max]){
                maxPos = i;
                if (minPos != -1){
                    ans = findmin(ans, maxPos-minPos+1);
                }
            }
        }
        return ans;
    }

    static void min_max(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[min]>arr[i]){
                min = i;
            }
            else if (arr[max]<arr[i]) {
                max = i;
            }
        }
    }

    static int findmin(int a, int b){
        
        return (a>b?b:a);
    }

}











/*
int[] arr = {99,11,44,55,77,66,34,23,42};
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            
            if(arr[min]>arr[i]){
                min = i;
            }
          
             if (arr[max]<arr[i]) {
                max = i;
            }
        }
        
        int count = 0;
        if (min<max) {
            for (int i = min; i <= max; i++) {
                count++;
            }
            System.out.println(count);
        }
        else {
            for (int i = max; i <= min; i++) {
                count++;
            }
            System.out.println(count);
        }
*/ 