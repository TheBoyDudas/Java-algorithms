import java.util.HashMap;

// Given a Roman Numeral (char) convert it to an integer

// Usually they are written largest to smallest like 12 written as XII -> X + II

/* INSTANCES WHERE SUBTRACTION IS USED:
 * I placed before V (5) and X (10) to make 4 and 9
 * X placed before L (50) and C (100) to make 40 and 90
 * C placed before D (500) and M (1000) to make 400 and 900
*/

class Solution {
  public int romanToInt(String s) {

  // 1. Map Roman Numerals to their integer values
  HashMap<Character, Integer> map = new HashMap<>();
  map.put('I', 1);
  map.put('V', 5);
  map.put('X', 10);
  map.put('L', 50);
  map.put('C', 100);
  map.put('D', 500);
  map.put('M', 1000);

  int total = 0;

  // 2. Iterate through the string
  for (int i = 0; i < s.length(); i++) {

      int current = map.get(s.charAt(i));

    // if value is less than next value subtract it (IV = 4 instead of 6)
    if (i < s.length()-1 && current < map.get(s.charAt(i + 1))) 
    {
        total -= current; 
    }
    else
      total += current;
    
  }
    return total;
  }
