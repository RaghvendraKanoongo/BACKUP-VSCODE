public class hola {

  public static void main(String[] args) {

    byte b = 1;
    byte b1 = 2;
    int i1 = b+b1;//1
    System.out.println(i1);
    short s4 = b1;

    short s1 = 2;
    int i = b+s1;//2
    System.out.println(i);

    short s2 = 3;
    i1 = s1+s2;//3
    System.out.println(i1);

    long l1 = 2;
    long l2 = l1+s1;//4
    System.out.println(l2);

    double d1 = 3.5;
    float f1 = 3.5f;
    double d2 = d1+f1;//5
    System.out.println(d2);

    char c1 = 'a';
    char c2 = 'a';
    i = c1+c2;//6
    System.out.println(i);

    i1 = i+c1;//7
    System.out.println(i1);

    d1 = c1+d2;//8
    System.out.println(d1);

    d2 = i1+d1;//9
    System.out.println(d2);
        
  }
}
abstract class a{
  abstract void ho();

}
class b extends a{
  void ho() {};
}