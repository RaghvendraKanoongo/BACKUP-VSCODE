package AAAAA;

public class TryCatch {
    public static void main(String[] args) {
        try {
            System.out.println("inside try");
            System.out.println(10/0);
        } catch ( ArithmeticException ae) {
            System.out.println("in AE catch");
        }
        catch (Exception e) {
            System.out.println("in parent catch");
        }
    }

}
