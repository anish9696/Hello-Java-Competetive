// write a java program to reverse a given integer
import java.util.Scanner;

public class Program2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reversedString = reverse(number);
        System.out.println("reversed number"+ reversedString);
    }

    public static int reverse(int number) {
        int num =0;
        while (number!=0) {
            int dig = number%10;
            num = num*10+dig;
            number = number/10;
            
        }
        return num;
    }
}
