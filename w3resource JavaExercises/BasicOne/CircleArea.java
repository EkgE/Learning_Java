import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter radius of a circle :");
        double radius = scanner.nextDouble();
        System.out.println("circle area is " + (radius * radius * Math.PI));
    }


}
