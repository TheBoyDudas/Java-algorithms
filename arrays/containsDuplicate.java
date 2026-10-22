public static boolean containsDuplicate(int [] nums) {
  // pick a number
  for (int i = 0;  i < nums.length; i++) {

  ` // compare it with every number after it
    for (int j = i + 1; j < nums.length; j++) {

      if (nums[i] == nums[j])
      {
        return true;
      }
    }
  }
  // no matching pair was found
return false;
}
