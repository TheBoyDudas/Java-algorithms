public class Main {
    public static void main(String[] args) {
        // binary search requires array to be sorted in ascending order
        int [] arr = {3, 4, 5, 6, 7, 8, 9, 10, 14};
        int key = 9;
        
        System.out.println(BinarySearch(arr, 0, arr.length - 1, key));
    }
    
    public static int BinarySearch(int[] A, int low, int high, int key) {
        while(low <= high) {
            int mid = low + (high - low)/2;
            
            if(key == A[mid]) // found key at mid
                return mid;
            
            else if(key < A[mid])
                high = mid-1;
            
            else
                low = mid+1;  
        }
        return -1;
    }
}
