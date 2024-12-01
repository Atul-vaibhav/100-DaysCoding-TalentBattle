import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the Array: ");
        for(int i=0; i<size;i++){
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.println("Sum is " +sum);
    }
}
