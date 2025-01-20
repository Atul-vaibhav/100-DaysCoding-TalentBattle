import java.util.Scanner;

public class Day70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the elements of the Array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        rotateclockwise(arr,n);

        System.out.print("Reversed Array: ");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void rotateclockwise(int[]arr,int n){
        int last = arr[n-1];
        for(int  i=n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }
}
