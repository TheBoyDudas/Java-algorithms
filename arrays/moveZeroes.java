public static void moveZeroes(int[] nums) {
// method is void because we modify the existing array instead of returning a new one

  int pos = 0; // where the non-zero number should go

    // move non-zero numbers down
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) 
        { 
          nums[pos] = nums[i]; // the first non-zero you encounter move to index 0
          pos++; // then increment
        }
      }
  
    // fill every remaining position with zero
    while (pos < nums.length) {
      nums[pos] = 0;
      pos++;
    }

}
