import java.util.*;
public class Day55 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elemnts of the Array: ");

        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        int base = reducetobase(array[0]);
        boolean madeequal = true;
        for (int i = 1; i < size; i++) {
            if ((array[i]) != base) {
                madeequal = false;
                break;
            }
        }
        if(madeequal){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static int reducetobase(int num){
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        return num;
    }
}