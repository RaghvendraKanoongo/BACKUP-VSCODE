/**
 * Temp
 */
public class Temp {

    public static void main(String[] args) {
        
    }
    static int hola(){
        try {
            System.out.println(10/0);
            return 1;
        } catch (Exception e) {
            return 2;
        }
        finally {

        }
    }
}