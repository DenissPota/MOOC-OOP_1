
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int counter = 1;
        int sum = 1;

        if (num == 0){
            System.out.println("Factorial is " + 1);

        }
        while (counter <= num) {
            sum *= counter;
            counter++;

        }
        System.out.println("Factorial is " + sum);

    }

}
