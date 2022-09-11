class Temp {
    public static void main(String[] args) {
        // System.out.println( funn(7, 5));

        int a = 5,b = 2,c = 4;
        for (int i = 3; i < 6; i++) {
            a = (b+c)+c
        }

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