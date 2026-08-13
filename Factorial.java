public class Factorial {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5; // Example number to calculate factorial
        long result = factorial(number); // Call the method
        System.out.println("Factorial of " + number + " is: " + result);
    }
}