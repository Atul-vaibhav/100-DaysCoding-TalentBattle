import java.util.Scanner;

public class Day61 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println();
        int t = sc.nextInt();

        for(int i=1;i<=t;i++){
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a+b<3){
            System.out.println("1");
        }else if(a+b>=3 && a+b<=10){
            System.out.println("2");
        }else if(a+b>=11&&a+b<=60){
            System.out.println("3");
        }else if(a+b<60){
            System.out.println("4");
        }
    }
}}
