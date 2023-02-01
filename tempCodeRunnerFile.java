import java.util.ArrayList;
public class tempCodeRunnerFile {
    public static void main(String args[]) {
        System.out.println(args[0]);
        if(isEligible(2))
            System.out.println("You are mature");
        else
            System.out.println("Still a kiddooo!!");
    }
    public static boolean isEligible (int age){
        if(age>=18)
            return true;
        return false;
    }
}