import java.util.Scanner;

public class BinaryMath {
    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);
        System.out.print("Enter your binary number :");
        int x = Integer.parseInt(scaner.next(), 2);
        System.out.print("Enter your second binary number :");
        int y = Integer.parseInt(scaner.next(), 2);
        System.out.println( "Sum of numbers: " + Integer.toBinaryString(x + y));
        System.out.println( "Division of numbers: " + Integer.toBinaryString(x / y));
        System.out.println( "Multiply of numbers: " + Integer.toBinaryString(x * y));
        System.out.println( "Subtract of numbers: " + Integer.toBinaryString(x - y));


    }
}
