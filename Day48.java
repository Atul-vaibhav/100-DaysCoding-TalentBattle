import java.util.Scanner;
import java.util.Arrays;

public class Day48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the Array: ");
        for(int i=0; i<size;i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        int[] uniqueArray = new int[size];
        int uniguecount=0;

        uniqueArray[uniguecount++] = array[0];

        for(int i=1; i<size; i++){
            if(array[i] != array[i-1]){
                uniqueArray[uniguecount++] = array[i];
            }
        }
        System.out.println("Array:");
        for(int i =0; i < uniguecount; i++){
            System.out.println(uniqueArray[i] + " ");
        }
        }
}
