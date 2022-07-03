import java.util.Scanner;

public class MultiplicationOfNumberTo10 {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
            for(int i = 1; i < 11; i++){
                System.out.println(x + " x " + i +  " = " + (x*i));
            }
        }
    }

