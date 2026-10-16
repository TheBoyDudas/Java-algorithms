public class Main {
    
    public static void main(String[] args) {
        
        int[] arr = {4, 9, 2, 7, 1};
        
        findMax(arr);
    }
    
    public static int findMax (int[] arr) {
        
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("Max: " + max);
        return max;
    }
    
}
