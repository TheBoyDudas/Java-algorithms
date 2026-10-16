public class Main {
    public static void main(String[] args) 
    {
        int [] A = {2,4,6,8,10,12,14};
        int key = 10;
        
        int low = 0;
        int high = A.length-1;
        
        System.out.println(RBinarySearch(A, low, high, key));
    }
    
    public static int RBinarySearch(int [] A, int low, int high, int key) {
        
        if(low <= high)
        {
            int mid = (low+high)/2;
            
            if(key == A[mid])
                return mid;
            
            else if(key < A[mid])
                return RBinarySearch(A, low, mid-1, key);
            
            else
                return RBinarySearch(A, mid+1, high,key);
        }
        return -1; // not found
    }
}
