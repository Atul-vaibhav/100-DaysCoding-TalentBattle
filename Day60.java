import java.util.*;
public class Day60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int sunny = 0;

            for(int j =0;j<7;j++){
                int day = sc.nextInt();
                sunny += day;
            }

            if(sunny>3){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
