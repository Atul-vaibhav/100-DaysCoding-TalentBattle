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
