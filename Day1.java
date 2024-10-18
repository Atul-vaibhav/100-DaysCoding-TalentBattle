import java.util.Scanner;

public class Day1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char inputChar = sc.next().charAt(0);
        inputChar = Character.toLowerCase(inputChar);
        if(inputChar == 'a' || inputChar == 'e' || inputChar == 'i' || inputChar == 'o' || inputChar == 'u'){
            System.out.println(inputChar+" is a Vowel");
        }else{
            System.out.println(inputChar+" is a consonant ");
        }
        sc.close();
    }
}