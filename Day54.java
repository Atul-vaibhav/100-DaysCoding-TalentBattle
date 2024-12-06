/* 
Day 54 coding Statement : Given an integer array of size N. Write Program to find whether Arrays are disjoint or not. Two arrays are said to be disjoint if they have no elements in common.

Sample input 1:

4

2 -4 -1 -3

3

1 3 5

Sample output 1:

Disjoint

Sample input 2:

5

1 5 -7 6 3

4

2 4 6 8

Sample output 2:

Not disjoint. ( 6 is common)

*/

import java.util.*;
public class Day54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array1: ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter the elements of the Array1: ");
        for(int i=0; i<size1;i++){
            array1[i] = sc.nextInt();
        }
        
        System.out.println("Enter the size of  the Array2:");
        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the Array2: ");
        for(int i=0;i<size2;i++){
            array2[i]  = sc.nextInt();
        }
        boolean disjoint  = true;

        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                if(array1[i]==array2[j]){
                    System.out.println("Not Disjoint Array. ("+array1[i]+") is common.");
                    disjoint = false;
                    break;
                }
            }
            if(!disjoint){
                break;
            }
        }
        if(!disjoint){
            System.out.println("Disjoint Array: ");
        }
    }
}
