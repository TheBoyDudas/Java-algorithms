import java.util.Arrays;
public class TwoPointer {
    // in-place reversal
    
    public static void main(String[] args) 
    {
        int arr[] = {8,3,9,15,6,10,7,2,12,4};
        
        for(int i = 0, j = arr.length-1; i<j; i++, j--){
            
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
