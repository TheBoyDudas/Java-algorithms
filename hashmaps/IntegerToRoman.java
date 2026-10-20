class Solution {
    public String intToRoman(int num) {

        HashMap<Integer, String> roman = new HashMap<>();

        roman.put(1,"I");
        roman.put(4, "IV");
        roman.put(5, "V");
        roman.put(9, "IX");
        roman.put(10, "X");
        roman.put(40, "XL");
        roman.put(50, "L");
        roman.put(90, "XC");
        roman.put(100, "C");
        roman.put(400, "CD");
        roman.put(500, "D");
        roman.put(900, "CM");
        roman.put(1000, "M");

        // Hashmap doesn't keep order so check this in order
        int [] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String result = ""; // empty string to hold the answer

        for (int i = 0; i < values.length; i++) {

          while (num >= values[i]) 
            {
              result = result + roman.get(values[i]); // add symbol to our answer 
              num = num - values[i]; //  subtract that amount from our number
            }
        }
            return result;  

      /* WHILE LOOP: num = 34, values[i] = 10
       * 
       * First Check: 34 >= 10
       * result = "" + "X"
       * num = 34 - 10
       *
       * Second Check: 24 >= 10
       * result = "X" + "X"
       * num = 24 - 10
       *
       * Third Check: 14 >= 10
       * result = "XX" + "X"
       * num = 14 - 10
       *
       * Outer for loop moves to next value - skips 9 and 5
       * 4 >= 4
       * result = "XXX" + "IV"
       * num = 4 - 4
      */
        
    }
}
