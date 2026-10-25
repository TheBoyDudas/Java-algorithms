public static int searchInsert(int[] arr, int target) {
  int low = 0;
  int high = arr.length-1;

  while (low < high) {

    int mid = low + (high-low)/2;

    if (target == arr[mid])
        return mid;

    else if (target < arr[mid])
        high = mid-1;

    else 
        low = mid + 1;
  }
  return low;
}


/*
 * SEARCH INSERT POSITION — BINARY SEARCH
 *
 * Array:  [1, 3, 5, 6]
 * Index:   0  1  2  3
 * Target: 2
 *
 * STEP 1: Initialize
 * low = 0, high = 3
 *
 * STEP 2: First iteration
 * mid = 1 → arr[1] = 3
 * 2 < 3, so high = mid - 1 = 0
 *
 * STEP 3: Second iteration
 * mid = 0 → arr[0] = 1
 * 2 > 1, so low = mid + 1 = 1
 *
 * STEP 4: Exit loop
 * low = 1, high = 0
 * low <= high is false.
 *
 * STEP 5: Return low
 * return 1
 *
 * The target isn't present, but index 1 is where
 * it belongs to keep the array sorted.
 *
 * Original: [1, 3, 5, 6]
 * Result:   [1, 2, 3, 5, 6] (if inserted)
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
