import java.util.HashMap;

// HashMap stores key-value pairs
// Name = key, Mark = value

public class HashMapBasics {
  public static void main(String[] args) {
    // Each key is a String; each value is an Integer
HashMap<String, Integer> marks = new HashMap<>();

  marks.put("Cian", 85);  // add a name and a mark
  marks.put("Kevin", 72);

  System.out.println(marks.get("Cian")); // 85
  System.out.println(marks.containsKey("Kevin")); // true

  marks.put("Cian", 90); // existing key, replace its value
  System.out.println(marks.get("Cian")); // 90
  }
}
