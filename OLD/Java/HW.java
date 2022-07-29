import java.sql.Struct;

public class HW {
    public static void main(String[] args) {
        
        int a = 02064767676;
        float d = 0xbeef;
        
        System.out.println(d);
        int b = a;
        int count = 0, store = 0;
        while(b!=0)     {

            b/=8;
            count++;
        }
        
        int arr[] = new int[count];
        for(int i=0; i<arr.length; i++)      {

            arr[i] = a%8;
            a/=8;
        }

        for (int i = arr.length; i>0; i--)     {

            store += arr[i-1];
            if (i==1)
                break;
            store *=10;
        }
        
        System.out.println(store);
    }
}
