class Temp {
    public static void main(String[] args) {
        System.out.println( funn(7, 5));
    }
    static int funn(int a, int b){
        if((b^a )<(a+b ) && (b-a )<(a-b)){
            b = a+2;
            a = 2+3+b;
            return a+b+funn(b,a)-a;
        }
        else 
        return a+1;
    }
}