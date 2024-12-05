/* 

Day 51 coding Statement : Given an integer array of size N, write a program to sort the array;

Sample input 1:

4

2 4 1 3

Sample output 1:

1 2 3 4

Sample input 2:

5

1 5 7 5 3

Sample output 2:

1 3 5 5 7

*/


import java.util.*;
public class Day51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the Array: ");

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
