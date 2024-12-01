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
