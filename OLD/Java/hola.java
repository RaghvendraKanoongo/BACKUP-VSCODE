import java.util.ArrayList;

public class hola {

  public static void main(String[] args) {
    ArrayList<Object> arr = new ArrayList<>();
    boolean flag = false;
    for (int i = 0; i < args.length; i++) {
        if(flag){
            arr.add(""+i);

        }
        else{
            flag = !flag;

        }
    }
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