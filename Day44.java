/* Day 44 coding Statement : Write Program to find number of even and odd elements in an array

Description

Get an array as input from the user and then count the number of even and odd elements present in the array.

Input

Enter size of array

4

Enter the elements :

1 3 4 5

Output

Number of even elements :

1

Number of odd elements :

3  */
import java.util.Scanner;

public class Day44 {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elemetns: ");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
            if(array[i]%2==0){
                count++;
            }
        }
        System.out.println("Number of Even Elements: "+count);
        System.out.println("Number of odd Elements: "+(size-count));
    }
}
