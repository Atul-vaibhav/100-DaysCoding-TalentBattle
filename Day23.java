/* Day 23 coding Statement : Write a program to Replace all 0’s with 1 in a given integer

Description

Get a number as input from the user and find the zeros present in that number.

Then convert the zeros into one and then print it.

Input

310020

Output

311121  */
import java.util.Scanner;
public class Day23 {
    public static int replaceZerosWithOnes(int number) {
        if (number == 0) {
            return 1;
        }

        int result = 0;
        int place = 1;

        while (number > 0) {
            int digit = number % 10;

            digit |= 1;
            result += digit * place;

            place *= 10;
            number /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int result = replaceZerosWithOnes(number);
        System.out.println(result);
    }
}
