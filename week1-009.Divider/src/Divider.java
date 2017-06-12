
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        System.out.print("Type a number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());
        double sum = (double) number / numberTwo;
        System.out.println("");
        System.out.println("Division: " + number + " / " + numberTwo + " = " + sum);

    }
}
