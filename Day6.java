import java.util.Scanner;
public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers for quadrants ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>=0 && num2>=0){
            System.out.println("This point lies in first Quadrant.");
        }else if(num1<0 && num2>=0){
            System.out.println("This point lies in second quadrant. ");
        }else if(num1<0 && num2<0){
            System.out.println("This point lies in third quadrant. ");
        }else{
            System.out.println("This point lies in second quadrant. ");
        }
        sc.close();
    }
}