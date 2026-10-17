import java.util.Scanner;
public class textSpeak
{
  /* Converts a string into text speak by replacing e with 3, s with 5 and b with 8 */
  /* Also calculates the sum of the numerical values */
  
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		{
      // Read a line of text
			String line = sc.nextLine();
			int length = line.length();

      // Replace specific letters with numbers
			String output = line.replace('e', '3')
                          .replace('s', '5')
                          .replace('b', '8');
			
      System.out.println(output);

      // calculate the total value of replaced letters
			int counter = 0;
			
			for(int i = 0; i < length; i++)
			{
				char c = line.charAt(i);
				
				if(c == 'e') counter+=3;
				if(c == 's') counter+=5;
				if(c == 'b') counter+=8;
			}
				System.out.println(counter);
        sc.close();
    }
  }
			
