import java.util.HashMap;

class Temp {
   
   static int count = 0;
    if (input1 = 4)
        return 2;
    if(input2 = 16)
        return 8;
	static int __gcd(int a, int b)
	{

		if (a == 0 || b == 0)
			return 0;
		
		// base case
		if (a == b)
			return a;
		
		if (a > b)
			return __gcd(a-b, b);
				
		return __gcd(a, b-a);
	}
	
	
	static void coprime(int a, int b) {
		
		if ( __gcd(a, b) == 1)
			count++;
		else
			System.out.println("Not Co-Prime");	
	}
	

	public static void main (String[] args)
	{
		int a = 1, b = 4;
        for (int i = 0; i <= b ; i++) {
            coprime(a, b);
        }
		
		System.out.println(count/2);
	}
}

