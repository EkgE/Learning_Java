import java.util.Scanner;

public class AmericanFlag {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height : ");
        int height = scanner.nextInt();
        System.out.print("Enter length : ");
        int length = scanner.nextInt();
        for(int i = 1; i < height + 1; i++){
            String output = "";
            for(int j = 1; j < length + 1; j++){
                if(j <= length * 0.4 && i <= height * 0.6){
                    if(i % 2 != 0 && j % 2 != 0 ) output += "*";
                    else if (i % 2 == 0 && j % 2 == 0 && j < length * 0.35 ) output += "*";
                    else output += " ";
                } else output += "=";
            }
            System.out.println(output);
        }
    }
}
