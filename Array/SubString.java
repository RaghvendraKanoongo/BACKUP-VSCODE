public class SubString {
    public static void main(String[] args) {
        // String s = "hola";
        // findSubString(s,0);
        int arr[] = { 1, 2, 3, 4 };
        /**
         * 1   2   3   4
         *  12  23  34
         *   123 234
         *    1234
         */
        /*
        //"hola"
        i = 0 // 0 -> 0 = 1
            h, o, l, a
        i = 1 //0 -> 1 = 2 
            ho, ol, la
        i = 2 //0 -> 2  = 3
            hol, ola
        i = 3 // 0 -> 3 = 4
            hola 
         */

        // System.out.println(1%1);
        String str = "hola";
        //subString(str, "");
        SubStringIt(str);
    }


    
    static void subStringIt(String str) {

        int n = str.length();
        for (int i = 0; i < n; i++) {
            // h , o, l , a 
            int k = 0;
            for(int j = i+1;j<=n;j++)  {
                String output = str.substring(k,j); // hola = 
                k++;
                System.out.print(output+" ");
            }
            System.out.println();
        }
    }

    static void SubStringIt(String arr){

        int n = arr.length();
        for (int i = 0; i < n; i++) {
            int k = 0;
            for (int j = i+1; j <= n; j++) {

               String op = arr.substring(k, j);
                k++;
                System.out.print(op+" ");
            }
            System.out.println();
            
        }
    }








    static void subString(String str, String output) {

        // base case ---
        // int n =
        // for (int i = 0; i < str.length(); i++) {

        // }
        // str = hola => , out = ""
        // out = h , str = > ola pickup
        // 2. out = "" , str = ola pickup not
        // base case
        if (str.isEmpty()) {
            System.out.println(output);
            return;
        }

        // 1.
        subString(str.substring(1), output);
        // 2.
        subString(str.substring(1), output + str.charAt(0));

    }
}