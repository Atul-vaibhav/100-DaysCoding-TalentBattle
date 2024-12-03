/* Day 50 coding Statement : Given an integer array of size N. Write Program to find sum of positive square elements in the array.

Sample input 1 :

4 1 2 3 4

Sample output 1 :

30

Explanation :

(1 + 4 + 9 + 16) = 30

Sample input 2 :

4 -1 -2 -3 -4

Sample output 2 :

30

Explanation :

(1 + 4 + 9 + 16) = 30  */

import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = Integer.parseInt(scanner.nextLine().trim());

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array (space-separated):");
        String[] input = scanner.nextLine().trim().split("\\s+");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int absValue = Math.abs(arr[i]);
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (Math.abs(arr[j]) == absValue) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                sum += (absValue * absValue);
            }
        }

        System.out.println("The sum of positive square elements (ignoring duplicates) is: " + sum);
    }
}
