public class Main {
   
    /* Algorithm that prints smallest number in the array and also
       prints the index of the smallest number int the array */
    
    // Additionally prints out the index of any 8's in the array
    
    public static void main(String[] args) 
    {
       
        // create array of size n
        int [] arr = {10, 8, 3, 15, 8};
        
        // Start with largest possible integer
        int smallest = Integer.MAX_VALUE;
        int index = 0;
        
        for (int i = 0; i < arr.length; i++)
        {
            // update the smallest value and its index
            if (arr[i] < smallest) {
                smallest = arr[i];
                index = i;
            }
            i++;
        }
        System.out.println("a[" + index + "] = " + smallest + " is the smallest");
        
        // Search array for instances of 8
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 8) {
                System.out.println("8 found at index " + j);
            }
        }
    }
}
