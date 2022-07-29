

//package Problem_Solving_6;

public class Bulb {
    public static void main(String[] args) {
        System.out.println("babaji");
        //int[] arr = {1,0,0,1,1,0,0,1};

        int[] arr ={1,1,1,1,0,1};
        System.out.println(solve(arr));
    }
    static int solve(int[] arr){
        int count = 0;
        int toggle = 0;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if(count == 0 & arr[i] == 0){
                count++;
                toggle++;
            }
            else if (count>0){
                if(count%2 == 1 && arr[i] == 1){
                    toggle++;
                    count++;
                }
                if(count%2 == 0 && arr[i] == 0){
                    toggle++;
                    count++;
                }
            }
        }
        return toggle;
    }
}
