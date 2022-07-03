import java.util.Scanner;

 class BinaryConverter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your number: ");
        int x = scan.nextInt(2);
        System.out.print("Enter your base: ");
        int base = scan.nextInt();
        String y = Integer.toString(x, base);
        System.out.println("Number "  + Integer.toString(x, 2) + " of base " + base + " is equal " + y );

    }
}
