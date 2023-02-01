import java.util.ArrayList;
public class tempCodeRunnerFile {
    public static void main(String args[]) {

        int a;

        if(isEligible(2))
            System.out.println("You are mature");
        else
            System.out.println("Still a kiddooo!!");
            sayHi(args);
    }
    public static boolean isEligible (int age){
        if(age>=18)
            return true;
        return false;
    }
    public static void sayHi(String hi[]){
        System.out.println("saying hi ");
    }
}
