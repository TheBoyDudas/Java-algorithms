public class Spaces {
  
  /* Print the String out, adding spaces in between each letter.
  If there is already a space between 2 letters another one should NOT be added */
	
  public static void main(String [] args) {
	
	String addSpaces = "notebook";
	int length = addSpaces.length();
	
	for(int i = 0; i < length; i++)
	{
		if(addSpaces.charAt(i) != ' ')
		{
			System.out.print(addSpaces.charAt(i) + " ");
		}
	}
	
