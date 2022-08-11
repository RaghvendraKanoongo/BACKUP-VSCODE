// package AAAAA;

public class Constructor {
    static void one(){
        two();
    }
    static void two(){
        one();
    }
    public static void main(String[] args) {
        System.out.println("babaji");
        Bb b = new Bb(10);
        // one();
        Dd d = new Dd();
        
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
    void one(){
        two();
    }
    void two(){
        one();
    }
}
abstract class Cc{
     Cc(){
        super();
     }

}
class Dd extends Cc{

}
