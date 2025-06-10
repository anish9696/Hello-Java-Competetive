// Check whether given string is a palindrom or not
import java.util.Scanner;

public class Program3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean palindrome = checkPalindrome(number); 
        System.out.println("checking palindrome "+ palindrome);  
    }

    public static boolean checkPalindrome(int num){
        if (num < 0) {
            System.out.println("Negative number are not palindrome");
            return false;   
        }
        int temp = num;
        int newNum = 0;
        while(num!=0){
            newNum = newNum*10 + num%10;
            num = num/10;
        }
        return newNum == temp;
    }
}
