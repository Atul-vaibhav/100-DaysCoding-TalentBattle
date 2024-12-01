import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size;i++){
            array[i] = sc.nextInt();
        }
        boolean even = false, odd = false;
        for(int num:array){
            if(num%2==0){
                even = true;
            }else{
                odd = true;
            }
            if(even&&odd){
                System.out.println("Mixed");
                return;
            }
        }
        if(even){
            System.out.println("Even");
        }else if(odd){
            System.out.println("Odd");
        }else{
            System.out.println("Mixed");
        }
    }
}