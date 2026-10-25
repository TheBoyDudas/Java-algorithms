import java.util.HashMap;
import java.util.Arrays;

/* Finding two numbers in an array that add up to a target 
   then returning their indices */

public class TwoSum {
  // Key is the number and the Value is its index
  public static void main(String [] args) {
    int [] numbers = {2, 7, 11, 15};
    int target = 9;

  }


  public static int[] twoSum(int[] numbers, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();

  for (int i = 0; i < numbers.length; i++) {
      int needed = target - numbers[i];  // 9 - 2 = 7

      // if we've seen it return its index and our current index
      if (map.containsKey(needed)) 
      {
        return new int[] {map.get(needed), i};
      }

    // Store the current number and its index
    map.put(numbers[i], i);
  }
    
    return new int[] {}; // return empty array if no pair exists
  }
}

    /* 
     * Pass 1: i = 0, numbers[i] = 2
     * needed = 9 - 2 = 7
     * Map is empty so 7 is not there
     * Store 2 -> 0 (number -> index)
     *
     * Pass 2: i = 1, numbers[i] = 7
     * needed = 9 - 7 = 2
     * Map contains 2 -> 0, so seen.get(2) returns index 0
     * Return {0, 1}: the stored index and current index
     */
    
    
