public class FindOpenDoors {
    public static void main(String[] args) {
        int doors = 100;
        int openDoors = 0;
        for (int i = 1; i*i <= doors ; i++) {
           openDoors++;
        } 
       System.out.println(openDoors);
    }
}