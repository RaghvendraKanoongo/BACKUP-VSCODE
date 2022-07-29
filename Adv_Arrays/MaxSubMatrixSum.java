
//  package Adv_Arrays;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;



public class MaxSubMatrixSum {
    public static void main(String[] args) {
        System.out.println("babaji");

        ArrayList <ArrayList<Integer>> colSum = new ArrayList< ArrayList<Integer>>();
        colSum.add(new ArrayList<>(Arrays.asList(1,2,3,4,5,6)));
        colSum.add(new ArrayList<>(Arrays.asList(11,22,33,44,55,66)));
        colSum.add(new ArrayList<>(Arrays.asList(2,3,4,5,6,8)));
        colSum.add(new ArrayList<>(Arrays.asList(5,6,3,2,1,9)));
        colSum.add(new ArrayList<>(Arrays.asList(7,8,9,10,11,12)));
        colSum.add(new ArrayList<>(Arrays.asList(5,4,3,2,1,8)));





        // ArrayList <ArrayList<Integer>> colSum = new ArrayList< ArrayList<Integer>>();
        // colSum.add(new ArrayList<>(Arrays.asList(-33, 34, 0, 69, 24, -22, 58, 62, -36, 5, 45, -19, -73, 61, -9, 95)));
        // colSum.add(new ArrayList<>(Arrays.asList(42, -73, -64, 91, -96, 2, 53, -8, 82, -79, 16, 18, -5, -53, 26, 71)));
        // colSum.add(new ArrayList<>(Arrays.asList(38, -31, 12, -33, -1, -65, -6, 3, -89, 22, 33, -27, -36, 41, 11, -47)));
        // colSum.add(new ArrayList<>(Arrays.asList(-32, 47, -56, -38, 57, -63, -41, 23, 41, 29, 78, 16, -65, 90, -58, -12)));
        // colSum.add(new ArrayList<>(Arrays.asList(6, -60, 42, -36, -52, -54, -95, -10, 29, 70, 50, -94, 1, 93, 48, -71)));
        // colSum.add(new ArrayList<>(Arrays.asList(-77, -16, 54, 56, -60, 66, 76, 31, 8, 44, -61, -74, 23, 37, 38, 18)));
        // colSum.add(new ArrayList<>(Arrays.asList(-18, 29, 41, -67, 15, -61, -42, 4, 30, 77, 6, -27, 86, -79, 45, 24)));
        // colSum.add(new ArrayList<>(Arrays.asList(-28, -30, -71, 77, 73, -3, 12, 86, -10, 61, -64, 55, 67, -45, 74, -69)));
        // colSum.add(new ArrayList<>(Arrays.asList(-48, 50, 50, 41, 24, 66, -70, 7, 91, -93, 37, -43, -13, 53, 83, 45)));
        // colSum.add(new ArrayList<>(Arrays.asList(9, -91, 58, -79, 88, -78, 46, 6, -70, -87, 68, 0, 91, 62, -45, -90)));
        // colSum.add(new ArrayList<>(Arrays.asList(59, -76, 37, 48, -17, 95, -59, -98, 50, -9, -64, 74, -80, 96, -79, 48)));
        // colSum.add(new ArrayList<>(Arrays.asList(99, -32, -16, -19, 34, -47, 99, -82, 38, 0, 88, 27, -33, 28, -7, -52)));
        // colSum.add(new ArrayList<>(Arrays.asList(-17, -93, -79, 10, -83, -87, 14, 9, -84, 35, -49, -100, -51, 19, 56, 98)));
        // colSum.add(new ArrayList<>(Arrays.asList(3, -76, -92, -56, -91, 89, 2, 95, -15, -7, 43, 23, 87, 14, 3, -52)));
        // colSum.add(new ArrayList<>(Arrays.asList(-100, -42, -82, 80, 96, 98, -19, 89, 98, -91, 57, -28, -78, 38, -8, -62)));
        // colSum.add(new ArrayList<>(Arrays.asList(79, 90, -43, 58, 91, -85, -12, 56, 11, -98, -66, -28, -45, 28, -54, 62)));

        solve(colSum, 5);
    }

    static int solve( ArrayList<ArrayList<Integer>> colSum, int b){

        
        
        
        for (int i = 0; i < colSum.size(); i++) {
            for (int j = 0; j < colSum.size(); j++) {
                if(i == 0)   
                    colSum.get(i).add(j, colSum.get(i).get(j));
                else 
                    colSum.get(i).add(j, colSum.get(i).get(j)+colSum.get(i-1).get(j));
            }
        }
       

        for (int i = 0; i < colSum.size(); i++) {
            for (int j = 0; j < colSum.size(); j++) {
                if(j == 0)
                    continue;
                else
                    colSum.get(i).set(j,colSum.get(i).get(j-1)+colSum.get(i).get(j));
            }
        }
        
        int maxSum = 0;
        int tempSum = 0;
        for (int i = b-1; i < colSum.size(); i++) {
           
            for (int j = b-1; j < colSum.size(); j++) {
                    tempSum = 0;
                    if(j == b-1 && i == b-1){
                        tempSum = colSum.get(i).get(j);
                       
                    }

                    
                    else if(j>b-1 && i == b-1){

                    }

                    else if(j == b-1 && i>b-1){

                        tempSum = colSum.get(i).get(j) - colSum.get(i-b).get(j);
                    }
                        
                    else {
                        tempSum = colSum.get(i).get(j) - (colSum.get(i-b).get(j) + colSum.get(i).get(j-b) - colSum.get(i-b).get(j-b));
                    }
                    maxSum = tempSum>maxSum? tempSum:maxSum;
            }
        }

        System.out.println(maxSum);
        
        return 0;
    }
}
/*






            [1,   3,  6,  10]
            [6,  14, 24,  36]
            [15, 33, 54,  78]
            [28, 60, 96, 136]

b = 2*2

            (1,   2,  3,  4)
            (5,   6,  7,  8)
            (9,  10, 11, 12)
            (13, 14, 15, 16)


            [1,  2,   3,  4]
            [6,  8,  10, 12]
            [15, 18, 21, 24]
            [28, 4,  36, 40]


            15, 18, 21
            18, 21, 24
*/