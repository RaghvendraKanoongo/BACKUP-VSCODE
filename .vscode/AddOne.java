public class AddOne {

    static int[] A = {1,2,3,4,9};
    static int count;
    static int len;
    static int pos = 0; 
    static int[] op;
    public static void main(String[] args) {
        
        plusOne(A);
    }

    static int[] plusOne(int[] A){
        for (int i = A.length-1; i>=0; i--){
            
            if (A[i]!=9){
                A[i] +=1;
                break;
            }
            else
                ++count;
        }

        for (int i = A.length-1; i > 0; i--) {
            if (count != 0){
                A[i] = 0;
                count--;
            }
            else if(i == 0 && A[i] == 9)
            {
                A[i] = 0;
            }
            else
                break;
        }

        for (int i = 0; i < A.length; i++) {
            if(A[i] == 0){
                len++;
                pos = 1+i;
            }
            else
                break;
        }
        op = new int[A.length-len];
        for (int i = 0; i < op.length; i++) {
            op[i] = A[pos];
            pos++;
        }
        printing(A);
        return op;
    }
    static void printing(int[] A){
        
        for (int i : A) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}