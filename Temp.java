/**
 * Temp
 */
public class Temp {

    public static void main(String[] args) {
        System.out.println(hola());
    }
    static int hola(){
        try {
            System.out.println(10/0);
            return 1;
        } 
        catch (Exception e) {
            return 2;
        } 
        finally {
            System.out.println("hi");
            return 3;
        }
    }
}

/**
 * InnerTemp
 */
interface InnerTemp {

    
}
