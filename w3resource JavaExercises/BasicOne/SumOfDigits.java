import java.util.Scanner;

class SumOfDigits {
    static public void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        long x = scan.nextLong();
        System.out.println("Sum of digits: " + sumOfLastDigits(x));
    }
    static public long lastDigit(long number){
        return number % 10;
    }
    static public int sumOfLastDigits(long number){
        int sum = 0;
        while(number != 0){
            sum += lastDigit(number);
            number /= 10;
        }
        return sum;
    }
}
