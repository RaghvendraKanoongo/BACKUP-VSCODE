// package tempCodeRunnerFile;
// import java.util.ArrayList;
public class tempCodeRunnerFile {
     int a;
    public static void main(String args[]) {

    //    tempCodeRunnerFile tempCodeRunnerFile = new tempCodeRunnerFile();
    //    System.out.println(tempCodeRunnerFile.a);
       System.out.println(test());


        // if(isEligible(2))
        //     System.out.println("You are mature");
        // else
        //     System.out.println("Still a kiddooo!!");
        //     sayHi(args);
    }
    public static boolean isEligible (int age){
        if(age>=18)
            return true;
        return false;
    }
    public static void sayHi(String hi[]){
        System.out.println("saying hi ");
    }

    static int test(){

        try{

            System.out.println("try");

            return 1;
        }
        catch(Exception e){
            System.out.println("catch");
            return 2;
        }
        finally{
            System.out.println("finally");
            return 3;
        }
    }
}
