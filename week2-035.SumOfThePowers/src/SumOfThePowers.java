
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int counter = 1;
        int sum = 1;

        
        while (counter <= num) {
            sum += (int)Math.pow(2, counter);
            counter++;

        }
        System.out.println("The result is " + sum);

    }

    }
