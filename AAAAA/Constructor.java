// package AAAAA;

public class Constructor {
    public static void main(String[] args) {
        System.out.println("babaji");
        Aa b = new Bb(10);
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
        this(10);
        System.out.println("In Bb Constructor");
    }
    Bb(int i ){
        super();
        System.out.println("in paramatrized constructor");
    }
}
