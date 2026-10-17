public static void main(String[] args) {
    int num = 13;
    boolean isPrime = true;  // assume it's prime until proven otherwise

    // numbers less than 2 are not prime
    if (num < 2) {
      isPrime = false;
    }

    // check every number from 2 up to num - 1
    for (int i = 2; i < num && isPrime; i++) {

        // if num divides evenly by i, it's not prime
        if (num % i == 0) {
            isPrime = false; 
            break;            
        }
    }

    // Display the result
    if (isPrime) {
        System.out.println(num + " is a prime number");
    } else {
        System.out.println(num + " is NOT a prime number");
    }
}
