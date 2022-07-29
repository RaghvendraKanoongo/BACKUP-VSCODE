public class LittlePonnyAndMaximumElement {
    public static void main(String[] args) {
        System.out.println("hola");
    }

    static int solve(int[] arr, int B) {
        int temp = 0;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>B){
                temp++;
            }
            if(arr[i] == B){
                flag = true;
            }
        }
        if(flag == true)
            return temp;
        else
            return -1;
    }
}//ZBR 17646