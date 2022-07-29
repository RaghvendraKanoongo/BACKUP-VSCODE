import java.nio.file.attribute.DosFileAttributeView;
import java.util.HashSet;

public class Sudoku {
    static String[] sudoku = {   "53..7....", //0 --- 8
                            "6..195...", //9
                            ".98....6.", //18
                            "8...6...3", //27
                            "4..8.3..1", //36
                            "7...2...6", //45
                            ".6....28.", //54
                            "...419..5", //63
                            "....8..79"};//72 --- 80
    public static void main(String[] args) {
        Sudoku ss = new Sudoku();
        System.out.println( ss.isValidSudoku(sudoku));
        
    }
    
    int isValidSudoku(String[] str){
        //int add = 38;
        // checkBlock(add-1);
        HashSet <String> check = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char ch = str[i].charAt(j);
                if(ch != '.'){
                    if( !check.add(ch+" row "+j) ||//!true
                        !check.add(ch+" column "+i) ||//!true
                        !check.add(ch+" block "+i/3+""+j/3))   { //!true if the element is not present
                           return 0;
                    }
                }
             }
        }
        return 1;
    }

    // void checkBlock(int i){
    //     int row = i - (i%9);
    //     row = i/9;
    //     row -= row%3; 

    //     int column = i%9;
    //     column -= column%3;
        
    //     // System.out.println("Row is: "+row);
    //     // System.out.println("Column is: "+column);
    //     // System.out.println(s[row].charAt(column));

    //     for (int j = row; j < row+3; j++) {
    //         for (int j2 = column; j2 < column+3; j2++) {
    //             System.out.print(s[j].charAt(j2)+" ");
    //         }
    //         System.out.println();
    //     }
    // }
}