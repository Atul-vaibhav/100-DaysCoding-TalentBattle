/* Day 42 coding Statement : Write Program to check if two arrays are the same or not

Description

Get two arrays as the input from the user and check whether it is the same or not.

Input

Enter the size of first array :

3

Enter the size of second array :

3

Enter elements of first array :

1 2 3

Enter elements of second array :

1 2 3

Output

Same */

import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of first Array: ");
        int size1 = sc.nextInt();

        System.out.println("Enter the size of the Second Array: ");
        int size2= sc.nextInt();

        if(size1 != size2){
            System.out.println("Not Same: ");
            return;
        }
        int[] array1 = new int[size1];
        System.out.println("Enter the Elements of the Array: ");
        for(int i=0; i<size1;i++){
            array1[i] = sc.nextInt();
        }
        int[] array2 = new int[size2];
        System.out.println("Enter the elements of the second Array: ");
        for(int i=0; i<size2;i++){
            array2[i] = sc.nextInt();
        }

        boolean areSame= true;

        for(int i=0; i<size1;i++){
            if(array1[i] != array2[i]){
                areSame = false;
                break;
            }
        }
        if(areSame){
            System.out.println("Same: ");
        }else{
            System.out.println("Not Same: ");
        }
    }
}
