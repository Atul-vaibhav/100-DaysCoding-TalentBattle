import java.util.Scanner;

public class Day9 {
    
    public static int getCount(int num){
        if(num<=9){
            return 1;
        }else{
            return 1+getCount(num/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int count = getCount(n);
        System.out.println(count);
        sc.close();
    }
}
