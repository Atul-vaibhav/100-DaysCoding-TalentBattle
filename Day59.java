import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println();
        int T= sc.nextInt();
        for(int i=1;i<=T;i++){
            System.out.print("Enter the height(in metres): ");
            int height = sc.nextInt();
            System.out.print("Enter the Weight(in kilograms): ");
            int weight = sc.nextInt();
        int BMI = weight/(height*height);
        if(BMI <=18){
            System.out.println("1");
        }else if(BMI>18 && BMI<25){
            System.out.println("2");
        }else if(BMI>=25 && BMI<30){
            System.out.println("3");
        }else{
            System.out.println("4");
        }
    }
}
}
