// public class Test1 {
//     void message(){
//         System.out.println("Hello sexy");
// 
//     public static void main(String[] args) {
//         try {
//             Class c = Class.forName("Test22");
//         }catch(Exception e){
//         }
//     }
// }
// class Test22{
//     static{
//        System.out.println("hola");
//     }
// }

public class Test1{
    public static void main(String[] args) {
     
        int a = 3;     
        String s = "hola";
        System.out.println(s.substring(0,1));  
        //call(a);
    }
    //a = 2 01,10
    static int call(int a){
        
        int count = 0;
        for (int i = a; i >= 0; i--) {
           int store = i;

            while(store != 0){
                
                if( (store&1) == 1 ){
                    count++;
                }
                store = store>>1;
            }
            
        }
       return count;
    }
}