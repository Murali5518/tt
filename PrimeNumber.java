public class PrimeNumber {
    public static void main(String[] args) {
        int number = 29;  // Change this number to test other values
        
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        // If number is less than 2, it is not prime
        if (num <= 1) {
            return false;
        }
        
        // Check from 2 to the square root of the number
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;  // num is divisible by i, hence not prime
            }
        }
        
        return true;  // num is prime
    }
}
