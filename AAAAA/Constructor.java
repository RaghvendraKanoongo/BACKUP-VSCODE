// package AAAAA;

public class Constructor {
    public static void main(String[] args) {
        System.out.println("babaji");
        Bb b = new Bb();
    }
    Constructor(){
        
    }
    Constructor(int i){
        this();
    }
}
class Aa{
    Aa(){
        System.out.println("in Aa Constructor");
    }
}
class Bb extends Aa{
    Bb(){
        System.out.println("In Bb");
    }
}
