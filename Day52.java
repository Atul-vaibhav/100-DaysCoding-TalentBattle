/* 

Day 52 coding Statement : Given an integer array of size N, write a program to reverse the array;

Sample input 1:

4

2 4 1 3

Sample output 1:

3 1 4 2

Sample input 2:

5

1 5 7 5 3

Sample output 2:

3 5 7 5 1


*/

import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the Array: ");
        for(int  i=0; i<size; i++){
            array[i] = sc.nextInt();
        }

        int start = 0;
        int end = size - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
