import java.util.HashMap;

class Temp {
    public static void main(String[] args) {
        int a, b, gcd = 1;
        a = 4;
        int count = 0;
        b = 1;
        int temp = a;

        for (int i = 1; i < temp; i++) {
            int min, max;
            a = i;
            min = a;
            if (min > b) {
                min = b;
                max = a;
            } else {
                min = a;
                max = b;
            }
            while (max > min) {
                int r = max % min;
                if (r == 0) {
                    gcd = min;
                    break;
                } else {
                    max = min;
                    min = r;
                }
            }
            if (gcd == 1) {
                count++;
            } 
        }
        
        return count-1;
    }

}
