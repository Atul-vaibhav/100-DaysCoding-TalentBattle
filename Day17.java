import java.util.Scanner;
public class Day17 {
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int i=1;
        while(i<=num){
            if(num%i==0){
                System.out.print(i+" ");
            }i=i+1;
        }
    }
}
