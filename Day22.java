import java.util.Scanner;

public class Day22 {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    public static void findSumOfTwoPrimes(int number) {
        boolean found = false;

        for (int i = 2; i <= number / 2; i++) {
            if (isPrime(i) && isPrime(number - i)) {
                System.out.println(number + " can be expressed as sum of " + i + " and " + (number - i));
                found = true;
                break; 
            }
        }
        if (!found) {
            System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        findSumOfTwoPrimes(number);
        scanner.close();
    }
}
