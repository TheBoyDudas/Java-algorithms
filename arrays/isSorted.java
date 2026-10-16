public class Main {
    
    public static void main(String[] args) 
    {
        int[] arr = {2, 11, 32, 156, 769};
        System.out.println(isSorted(arr));
    }
    
    public static boolean isSorted(int[] arr) {
        
        for (int i = 0; i < arr.length-1; i++) {
            
            if(arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
