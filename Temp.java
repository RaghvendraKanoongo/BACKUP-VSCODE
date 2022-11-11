import java.util.HashMap;

class Temp {
    public static void main(String[] args)
    {
        int a, b, gcd = 1;
        a = 4;
        b = 0;
        for (int i = 0; i < args.length; i++) {
        int min, max;
        min = a;
        if (min > b)
        {
            min = b;
            max = a;
        }
        else
        {
            min = a;
            max = b;
        }
        while (max > min)
        {
            int r = max % min;
            if (r == 0)
            {
                gcd = min;
                break;
            }
            else
            {
                max = min;
                min = r;
            }
        }
        if (gcd == 1)
        {
            System.out.println("Co Prime Numbers");
        }
        else
        {
            System.out.println("Not Co Prime Numbers");
        }
    }
    
}

