// write a java program to count number of digit in a given integer 

// another approach is to convert the number into string and get the length of the string 

import java.util.Scanner;

public class Program1 {
    public static void main(String args[]){
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        int countnumber = countDigits(number);
        int countnumber2 = countDigits2(number);
        // while(number!=0){
        //     number = number /10;
        //     count++;
            
        // }
        System.out.println("Count of number of digit in a given integer"+countnumber);
        System.out.println("Count of number of digit in given integer"+countnumber2);
    }
    public static int countDigits(int number){
        number = Math.abs(number);
        return String.valueOf(number).length();
    }

    public static int countDigits2(int number){
        int count = 0;
        while(number!=0){
            number = number/10;
            count++;
        }
        return count;
    }
}