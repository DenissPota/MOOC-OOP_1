
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        String secret = "42";
        while (true) {
            System.out.print("Type the password: ");
            String guess = reader.nextLine();

            if (guess.equals(password)) {
                System.out.println("Right!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("The secret is: " + secret);

    }
}
