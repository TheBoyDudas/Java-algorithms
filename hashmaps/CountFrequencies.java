import java.util.HashMap;

public class CountFrequencies {
// We count how many times each number appears
// Our HashMap will store the number as the KEY and its count as the VALUE
// Each key has its own value

public static void main(String[] args) {
  int [] numbers = {4, 2, 4, 3, 2, 4};

  HashMap<Integer, Integer> frequencies = new HashMap<>();

  for (int i = 0; i < numbers.length; i++) {
    int num = numbers[i];
    
    // Get this number's value (count) or 0 of its not in the map yet
    int count = frequencies.getOrDefault(num, 0);

    count++;
    frequencies.put(num, count);
    }
  System.out.println(frequencies);
