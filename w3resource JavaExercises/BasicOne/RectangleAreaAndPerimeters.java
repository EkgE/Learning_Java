import java.util.Scanner;

public class RectangleAreaAndPerimeters {
    static public void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x value: ");
        double x = scan.nextDouble();
        System.out.print("Enter y value: ");
        double y = scan.nextDouble();
        System.out.println("Area of rectangle is: " + (x*y));
        System.out.println("Perimeter of rectangle is: " + (x*2 + y*2));


    }
}
