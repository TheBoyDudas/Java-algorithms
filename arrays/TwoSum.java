public static int[] twoSum(int[] nums, int target) {
// Two Sum algorithm in a SORTED array
  
  // start with one pointer at each end
  int left = 0;
  int right = nums.length-1;

  
  while (left < right) {
    int sum = nums[left] + nums[right];

    if (sum == target) {
      return new int[] {left, right};
    }
    else if (sum < target) {
      // we need a larger sum
      left++;
    }
    else {
      // we need a smaller sum
      right--;
    }
  }

  // no matching pair exists
  return new int[] {-1, -1};
}

public static void main(String [] args) {
  int [] nums = {1, 2, 4, 6, 9};
  int target = 8;

  int [] result = twoSum(nums, target);
  System.out.println(result[0] + ", " + result[1]); // 1, 3

  
      
