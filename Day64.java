import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T  = sc.nextInt();
        sc.nextLine();

        while(T-->0){
            String feedback = sc.nextLine();

            if(feedback.contains("010") || feedback.contains("101")){
                System.out.println("Good");
            }else{
                System.out.println("Bad");
            }
        }
        sc.close();
    }
}
