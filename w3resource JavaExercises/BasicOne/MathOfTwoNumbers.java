import java.util.Scanner;

public class MathOfTwoNumbers {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        String quote = x + " and " + y +" is ";
        System.out.println("Division of " + quote + (x/y));
        System.out.println("Sum of " + quote + (x + y));
        System.out.println("Subtract of " + quote + (x-y));
        System.out.println("Multiplication of " + quote + (x*y));
        System.out.println("Remainder of " + quote + (x%y));
    }

}
