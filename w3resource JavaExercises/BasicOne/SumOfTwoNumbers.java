import java.util.Scanner;
class SumOfTwoNumbers {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int x = scanner.nextInt();
        System.out.print("Enter second value: ");
        int y = scanner.nextInt();
        System.out.println ("Sum of values equal " + (x + y));
    }
}
