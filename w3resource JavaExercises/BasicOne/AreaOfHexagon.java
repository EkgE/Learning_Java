import java.util.Scanner;

public class AreaOfHexagon {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon: ");
        int x = scan.nextInt();
        System.out.println("The area of the hexagon is: " + areaOfHexagon(x));
    }
    public static double areaOfHexagon(int sideLength){
        return (6 * sideLength * sideLength) / (4 * Math.tan(Math.PI/6));
    }
}
