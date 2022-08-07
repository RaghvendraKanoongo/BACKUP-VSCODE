import java.util.ArrayList;
import java.util.Iterator;

public class hola {

  public static void main(String[] args) {
    ArrayList<Object> arr = new ArrayList<>(10);
    boolean flag = false;
    for (int i = 0; i < 10; i++) {
        if(flag){
            arr.add("h"+i);
            flag = !flag;
        }
        else{
            flag = !flag;
            arr.add(i);
        }
    }
    System.out.println(arr);
    Iterator itr = arr.iterator();
    
  }
}
class A{
  void tc(){
    System.out.println("i am out in A");
  }
}
class B extends A{
  void tc(int a){
    
    System.out.println("hola from B");
  }
}