public class Main {
    public static void main(String[] args) {
        
        int arr[] = {8, 9, 4, 7, 6, 3, 10, 5, 14};
        int x = 14;
        
        System.out.println(LinearSearch(arr, x));   
}
    
    public static int LinearSearch(int arr[], int x) {
          for(int i = 0; i < arr.length; i++) {
            if (x == arr[i])
                return i;
    }
        return -1;
    }
}
