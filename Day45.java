/* Day 45 coding Statement : Write Program to find smallest and largest element in an array

Description

Get an array as input from the user and then find the smallest and largest element in the array.

Input

Enter the size of array :

5

Enter the elements :

10 20 5 40 30

Output

Smallest Number :

5

Largest Number :

40  */

import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements: ");
        for(int  i=0; i<size; i++){
            array[i] = sc.nextInt();
            if(array[i] < smallest){
                smallest = array[i];
            }
            if(array[i]>largest){
                largest = array[i];
            }
        }
        System.out.println("Smallest number " +smallest);
        System.out.println("Largest Number " +largest);
    }
}
