import java.util.Scanner;

public class AverageOfInputs {
    public static void main(String[] args){
        int sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int number = scanner.nextInt();
            sum += number;
            count++;
        }
        System.out.println("Average of inputs is " + (sum / count));
    }
}
