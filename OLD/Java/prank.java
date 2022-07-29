class prank{
    
    static String[] input = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    static String[] store = new String[input.length];
    public static void main(String[] args) {

        fizzbuzz(input);
        for (int i = 0; i < store.length; i++) {
            
            System.out.println(input[i]);
        }
    }

    static String[] fizzbuzz(String[] arr){
       
        for(int i = 0; i < input.length; i++){

            if (Integer.parseInt(arr[i])%3 == 0 || Integer.parseInt(arr[i])%5 == 0)
            {
                if (Integer.parseInt(arr[i])%3  == 0){
                    input[i] = "fizz";
                }

                if (Integer.parseInt(arr[i])%5  == 0){
                    input[i] = "buzz";
                }

                if ( (Integer.parseInt(arr[i])%3 == 0) && (Integer.parseInt(arr[i])%5 == 0) ) {
                    input[i] = "fizzbuzz";
                }
            }
            store = arr;
           
        }
        return store;
    }
}
