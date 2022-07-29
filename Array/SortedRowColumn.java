public class SortedRowColumn {
    public static void main(String[] args) {
        int[][] arr = { {2,8,8,8},
                        {2,8,8,8}, 
                        {2,8,8,8}};
        int key = 8;
        printing(arr);
        System.out.println("The key is: ");
        System.out.println(findKey(arr, key));
        
    }

    static int findKey(int arr[][], int key){

        int i  = 0;
        int j = arr[0].length-1;
        int store = Integer.MAX_VALUE;
        while (j >= 0 && i != arr.length) {
            
            if(arr[i][j] == key){
                int hold = (i+1)*1009+(j+1);
                store = store < hold ? store : hold;
                j--;
            }
            else if (arr[i][j] > key){
                j--;
            }
            else if(arr[i][j] < key)
                i++;
        }
        if (store == Integer.MAX_VALUE) {
            return -1;
        }
        else
            return store;
    }

    static void printing(int[][] arr){
        for (int[] i : arr) {
            for (int js : i) {
                System.out.print(js+" ");
            }
            System.out.println();
        } 
    }
    
}
