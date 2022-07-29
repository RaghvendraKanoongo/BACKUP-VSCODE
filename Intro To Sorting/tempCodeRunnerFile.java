import java.util.Arrays;
import java.util.HashMap;

// int[] finalArr;

// for(int a = 1; i<= x; I++ ){
//     for(int j = 1; j<=y-x; j++){
//         for(int j1 = 0; j1 < k; j1++){
//             store[j1] = a+j1*j;
//             if(store[j1] == x){
//                 flag1 = true;
//             }
//             if(sotre [j1] == y){
//                 flag2 = true;
//             }
//             if(flag1&&flag2 && j1 == k-1){
//                 if(store[0]<finalArr[0])
//                     finalArr = store; 
//             }
//         }
//     }
// }
/**
 * tempCodeRunnerFile
 */
public class tempCodeRunnerFile {

    public static void main(String[] args) {
        char[][] arr = {{'a','b','a','A'},
                        {'a','f','c','f'},
                        {'a','c','f','A'}};
       System.out.println(Arrays.toString(solve(arr)));
        
    }

    static int[][] solve(char[][] arr) {
        
        int[][] finalArr = new int[arr.length][arr[0].length];
        
        // HashMap <Character,Integer> map  = new HashMap<>();

        char[] map = new char[53];

        for (int i = 0; i < finalArr.length; i++) {
            for (int j = 0; j < finalArr[0].length; j++) {
                if(arr[i][j] >= 'a'){
                    int num = arr[i][j] - 'a';
                    map[25+num] += 1;
                }
                else
                    map[arr[i][j]-'A'] += 1;
            }
        }
        return finalArr;
    }

}