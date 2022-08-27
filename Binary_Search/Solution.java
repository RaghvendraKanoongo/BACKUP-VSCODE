 package Binary_Search;

public class Solution {
    static int[] arr ={0,0,0,0,0,1,1,1,1};

    static boolean isBadVersion(int n){
        if(arr[n]==1)return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(9)); 
    }

    static public int firstBadVersion(int n) {
    
        int start = 0,end = n-1,mid = (start + end)/2;
        while(end - start >=1 ){
            if(isBadVersion(start+1)){return start + 2;}
                if(isBadVersion(mid)){
                 end = mid;
                }
                else{
                    start = mid;
                }
                mid = (start + end)/2;
        }
        return start+1;
    }
}