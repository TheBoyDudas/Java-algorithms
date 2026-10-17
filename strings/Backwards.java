public class Backwards {
	public static void main(String [] args) {

    /* Prints the words of a sentence in reverse order */
    /* Traverses the string backwards using spaces to identify individual word */
		
		String sentence = "pay no attention to that man behind the curtain";
		
    int length = sentence.length(); // starting from right
		int end = length; // tracks where the current word ends
		
		for(int i = length - 1; i >= 0; i--)
			{
				// when we hit a space we've found the boundary BEFORE a word
				if(sentence.charAt(i) == ' ')
				{
				// print the word, from one AFTER the space (i+1) to end
				System.out.println(sentence.substring(i+1, end));
				
          // move end to space position, ready for the next word
				end = i;
				}
			}
			// first word has no space so the loop misses it
			// print it separately using substring from 0 to where end stopped
			System.out.println(sentence.substring(0, end));
		}
	}
