/* We merge arr2 into arr1. Both arrays must be sorted.
   arr1 has extra spaces at the end to fit elements from arr2. 
   We fill from the back so we don't overwrite numbers we still need */
public static void mergeArrays(int[] arr1, int m, int[] arr2, int n) 
{ 
  int i = m - 1; // last number in arr1
  int j = n - 1; // last number in arr2
  
  int k = m + n - 1; // last space in arr1

  while (j >= 0)
  {
    // Compare arr1[i] = 5 with arr2[j] = 4. 
    if (i >= 0 && arr1[i] > arr2[j])
    {
      // Since 5 is bigger write it to arr1[k]
      arr1[k] = arr1[i]; 
      i--;
    } 
    
    else 
    {
      arr1[k] = arr2[j];
      j--;
    }

    k--; // move to the next space to fill
  }
}
    

public static void main(String[] args) 
{
  int[] arr1 = {1, 3, 5, 0, 0, 0};
  int[] arr2 = {2, 4, 6};

  mergeArrays(arr1, 3, arr2, 3);

  System.out.print("[ ");
    
    for(int i = 0; i < arr1.length; i++) {
        System.out.print(arr1[i] + " ");
    }
     System.out.println("]");
}

/* 
      Output:
      [ 1 2 3 4 5 6 ]
*/
