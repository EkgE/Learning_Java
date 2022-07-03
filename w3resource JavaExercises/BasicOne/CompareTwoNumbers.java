import java.util.Scanner;

public class CompareTwoNumbers {
    static public void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        compareNumbers(x, y);
    }
    public static void compareNumbers(int x, int y){
        if(x == y) System.out.println(x + " == " + y);
        else System.out.println(x +  " != " + y);

        if(x < y) System.out.println(x +  " < "  + y);
        else if (x > y) System.out.println(x +  " > "  + y);

        if(x <= y) System.out.println(x +  " <= "  + y);
        if(x >= y) System.out.println(x +  " >= "  + y);
    }
}
