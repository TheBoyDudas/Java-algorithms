import java.util.Scanner;

// 4! = 4 x 3 x 2 x 1 = 24

public class methodFactorial{
	public static void main(String [] args)
	{
		Factorial(5);
	}
	
	public static void Factorial(int toBeFac){
		int factorial = 1;
		
		for(int i = 1; i <= toBeFac; i++)
		{
			factorial *= i;
		}
		System.out.println(factorial);
		
	}
	
