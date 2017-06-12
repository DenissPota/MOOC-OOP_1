
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int number2 = Integer.parseInt(reader.nextLine());
        
        while (number <= number2){
            System.out.println(number);
            number++;
        }
        
        // write your code here

    }
}
