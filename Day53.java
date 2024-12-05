/* 

Day 53 coding Statement : Given an integer array of size N. Write Program to find maximum product subarray in a given array.

Sample input 1:

4

2 -4 -1 -3

Sample output 1:

8 = {2, -4, -1}

Sample input 2:

5

1 5 -7 5 3

Sample output 2:

15 = {5, 3}

*/

import java.util.*;
public class Day53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the Elements: ");

        for(int i=0; i<size;i++){
            array[i] = sc.nextInt();
        }
        int maxProduct = array[0];  
        int currMax = array[0];     
        int currMin = array[0];     
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < size; i++) {
            int temp = currMax;

            currMax = Math.max(array[i], Math.max(currMax * array[i], currMin * array[i]));
            currMin = Math.min(array[i], Math.min(temp * array[i], currMin * array[i]));

            if (currMax == array[i]) {
                tempStart = i;
            }
            if (currMax > maxProduct) {
                maxProduct = currMax;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Maximum product subarray:");
        System.out.println(maxProduct + " = {" + array[start]);
        for (int i = start + 1; i <= end; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.println("}");
    }
}
