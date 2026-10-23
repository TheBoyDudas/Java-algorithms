
public static int DuplicateRemover(int [] arr) {

  if (arr.length == 0)
  {
    return 0;
  }

  int k = 1; // first element is already unique

  for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[i - 1])
      {
        arr[k] = arr[i];  // put next unique value at position k
        k++;
      }
  }
  return k;
  /* so you start at 1 because the first value is unique, 
     compare it with the value previous to it and if its unique store it and move on

     i moves forward every iteration but k only moves when we find a new value
  */

public static void main(String [] args) {
  int [] arr = {1, 1, 2, 2, 3};
  int count = DuplicateRemover(arr);

  for (int i = 0; i < count; i++)
    {
      System.out.println(arr[i]);
    }
