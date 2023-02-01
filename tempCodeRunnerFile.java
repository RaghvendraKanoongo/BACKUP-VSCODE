import java.util.ArrayList;
public class tempCodeRunnerFile {
    public static void main(String args[]) {
        if(isEligible(20))
            System.out.println("You are mature");
        else
            System.out.println("");
    }
    public static boolean isEligible (int age){
        if(age>=18)
            return true;
        return false;
    }
}