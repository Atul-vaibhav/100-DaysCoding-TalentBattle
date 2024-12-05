/* 

Day 49 coding Statement : Given 2 integer arrays X and Y of same size. 
Consider both arrays as vectors and print the minimum scalar product (Dot product) of 2 vectors.

Sample input 1 :

4

1 2 3 4

5 6 7 8

Sample output 1 :

60

Explanation :

(4*5 + 3*6 + 2*7 + 1*8) = 60

Sample input 2 :

4

-1 -2 -3 -4

5 6 -7 -8

Sample output 2 :

-17

Explanation :

(-1*-8 + -2*-7 + -3*6 + -4*5) = -17 

*/

import java.util.Scanner;
import java.util.Arrays;
public class Day49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter the Elements: ");
        for(int i =0 ;i<size;i++){
            array[i] = sc.nextInt();
        }
        int[] array1 = new int[size];
        System.out.print("Enter the elements: ");
        for(int i=0; i<size;i++){
            array1[i] = sc.nextInt();
        }
        Arrays.sort(array);
        Arrays.sort(array1);

        for(int i=0; i < size / 2; i++){
            int temp = array1[i];
            array1[i] = array1[size-1-i];
            array1[size-1-i] = temp;
        }

        int product = 0;
        for(int i=0; i < size; i++){
            product += array[i] * array1[i];
        }
        System.out.println("Scalar Product: "+product);
    }
}
