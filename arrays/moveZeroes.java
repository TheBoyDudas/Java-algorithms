public static void moveZeroes(int[] nums) {
// method is void because we modify the existing array instead of returning a new one

  int pos = 0; // where the non-zero number should go

    // move non-zero numbers down
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) 
        { 
          nums[pos] = nums[i]; // the first non-zero you encounter move to index 0
          pos++; // then increment if you do encounter a non-zero
        }
      }
  
    // fill every remaining position with zero
    while (pos < nums.length) {
      nums[pos] = 0;
      pos++;
    }

}

/* 0	0	Skip	[0, 1, 0, 3, 12]
   1	1	Copy to position 0	[1, 1, 0, 3, 12]
   2	0	Skip	[1, 1, 0, 3, 12]
   3	3	Copy to position 1	[1, 3, 0, 3, 12]
   4	12	Copy to position 2	[1, 3, 12, 3, 12]
*/
