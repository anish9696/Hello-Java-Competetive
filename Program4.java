// write a program to find the greatest common divisor or hcf

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int hcf = gcd(number1, number2);
        System.out.println("HCF of number is "+hcf);
    }
    public static int gcd(int num1, int num2){
        int a, b;
        if(num1> num2){
            a = num2;
            b = num1;
        }else {
            a = num1;
            b = num2;
        }
        while(b != 0){
            int temp = b;
            b = a %b;
            a = temp;
        }
        return Math.abs(a);
    }
}
