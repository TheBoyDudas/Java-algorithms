import java.util.HashMap;

public class ContainsDuplicate {
  // We check whether any number appears more than once
  
  public static void main(String [] args) {
    int [] numbers = {4, 2, 3, 2};

  }

  // Has an Integer Key and a Boolean Value
  public static boolean containsDuplicate(int [] numbers) {
    HashMap<Integer, Boolean> seen = new HashMap<>();

    for (int num : numbers) {
      if (seen.containsKey(num)) 
      {
          return true;
      }

      seen.put(num, true); // record that we've seen this number
    }

  return false; // we checked each number without finding a duplicate
  }
}
