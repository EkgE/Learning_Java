import java.util.Scanner;

public class MultiplicationOfTwoNumbers {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y =  scanner.nextInt();
        System.out.println("Result of multiplication " + x + " with " + y + " is " + (x*y));
    }
}
