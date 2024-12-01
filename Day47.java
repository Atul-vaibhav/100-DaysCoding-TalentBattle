import java.util.Scanner;

public class Day47 {
    public static boolean ispal(int num){
        if (num<0) return false;
        int original = num, reverse = 0;

        while (num>0) {
            reverse = reverse *10 + num %10;
            num /= 10;
        }
        return original == reverse;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        int[] array= new int[size];
        System.out.println("Enter the elements of the Array: ");
        int longestpal = -1;
        for(int i=0;i<size;i++){
            int num  = sc.nextInt();
        if(ispal(num)){
            if(longestpal == -1 || num > longestpal){
                longestpal = num;
            }
        }
    }
    if(longestpal == -1){
        System.out.println("No palindrome found ");
    }else{
        System.out.println("Longest palindrome: "+longestpal);
    }
}
}