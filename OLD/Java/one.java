import java.sql.*;



class one
 {
        static int a = 45376;
        static int updatedNumber;
        public static void main(String[] answer){
                
                recursion(a);
                System.out.println(updatedNumber);
	        
        
	}
        public static void recursion(int a)     {
                int increse = 0;
                if(a>0){
                        increse = a%10;
                        //System.out.println(increse);
                        a /= 10;
                        recursion(a);                        
                }
                if (increse!=0) {
                        increse+=2;
                        if(updatedNumber == 0)
                                updatedNumber = increse;
                        else{
                                updatedNumber*=10;
                                updatedNumber+=increse;
                        }
                }
        }

 }

