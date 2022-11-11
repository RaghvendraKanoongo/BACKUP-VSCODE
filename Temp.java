import java.util.HashMap;

class Temp {
    public static void main(String[] args) {
        

    }
    static int funn(int a, int b){
        if((3&b )>(b-3) && (b-a )>(6-a)){
            b = b+2;
            a = (a+3)+b;
            a = (b+1)+b;
            return 1+funn(a+1,b+2)+2;
        }
        else 
            return a+b-1;
    }
}

