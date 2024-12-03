import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the Array: ");
        for(int i=0; i<size;i++){
            array[i] = sc.nextInt();
        }
        int sum = 0;
        for(int num : array){
            sum += (num * num );
        }
        System.out.println("Sum is: "+sum);
    }
}
