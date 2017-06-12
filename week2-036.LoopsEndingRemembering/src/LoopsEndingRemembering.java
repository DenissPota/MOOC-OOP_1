
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int evens = 0, odds = 0, amountOfNums = 0, sum = 0, num = 0;
        while (num != -1) {
            num = Integer.parseInt(reader.nextLine());
            if (num != -1) {
                sum += num;
                amountOfNums++;
            }
            if (num % 2 == 0){
            evens++;
            }
            else if (num % 2 == 1) {
            odds++;
            }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + amountOfNums);
        System.out.println("Average: " + (double) (sum) / amountOfNums);
        System.out.println("Even numbers: " + evens);
        System.out.println("Odd numbers: " + odds);

    }
}
