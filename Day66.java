import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        while(t-->0){
            String A = sc.nextLine();
            String B= sc.nextLine();

            Boolean found = false;

            outerloop:
            for(int i=0;i<A.length();i++){
                char charA = A.charAt(i);
                for(int j= 0;j<B.length();j++){
                    if(charA == B.charAt(j)){
                        found = true;
                        break outerloop;
                    }
                } 
            }
            if(found){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}
