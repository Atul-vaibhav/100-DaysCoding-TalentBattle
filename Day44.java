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
