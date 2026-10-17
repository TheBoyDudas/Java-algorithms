	public static void main(String[] args)
	{
    /* Finds ALL 5-digit numbers that are divisible by 53 and are also palindromes */
    /* Converts numbers to strings to compare digits */


    // check every 5-digit number
		for(int num1 = 10000; num1 <= 99999; num1++)
		{
			if(num1 % 53 == 0)
			{
        // convert the number into a String
				String number = Integer.toString(num1);
				
				char digit1 = number.charAt(0);
				char digit2 = number.charAt(1);
				char digit3 = number.charAt(2);
				char digit4 = number.charAt(3);
				char digit5 = number.charAt(4);

        // Check that the number is a palindrome
				if(digit1 == (digit5) && digit2 == (digit4))
				{
					System.out.println(num1);
					System.out.println(digit1);
					System.out.println(digit2);
					System.out.println(digit3);
					System.out.println(digit4);
					System.out.println(digit5);
					System.out.println("***********");
				}
			}
