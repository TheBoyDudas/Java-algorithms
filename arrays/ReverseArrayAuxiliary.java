public class ReverseArrayAuxiliary {
    /* This program uses an additional array to reverse the            elements of an original array*/
    
    public static void main(String[] args) {
        
        int [] A = {8, 3, 9, 15, 6, 10, 7, 2, 12, 4};
        
        reverseArray(A);
        
        for(int i = 0; i < A.length; i++) {
            System.out.print(A[i] + ", ");
        }
    }
        
    public static void reverseArray(int[] A) {
        
        int [] B = new int[A.length];
        
        // 1. Reverse copying
        for(int i = A.length-1, j = 0; i >=0; i--, j++) 
        {
            B[j] = A[i]; // last becomes first in new array
        }
        
        // 2. Copying from new array to original array
        for(int i = 0; i < A.length; i++)
        {
            A[i] = B[i]; // copying directly
        }
    }        
}
