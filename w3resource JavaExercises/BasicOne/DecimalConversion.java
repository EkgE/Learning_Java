import java.util.Scanner;

public class DecimalConversion {
    static public void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        String number = scan.next();
        System.out.print("Enter base of target number: ");
        int base = scan.nextInt();
        Converter(number, base);
    }
    public static void Converter(String number, int base){
        String converted = Integer.toString(Integer.parseInt(number),base);
        System.out.println("Number: " + number + " is equal " + converted +  " of a base " + base );
    }
}
