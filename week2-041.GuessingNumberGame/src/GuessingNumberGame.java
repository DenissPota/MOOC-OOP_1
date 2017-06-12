
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int guess = -1;
        int numberDrawn = drawNumber();
        int guessesCount=0;
        System.out.println(numberDrawn);

        while (guess != numberDrawn) {
            System.out.print("Guess a number: ");

            guess = Integer.parseInt(reader.nextLine());
            
            if (guess < numberDrawn){
                guessesCount++;
                System.out.println("The number is greater, guesses made: " + guessesCount);
            }
            else if (guess > numberDrawn) {
                guessesCount++;
                System.out.println("The number is lesser, guesses made: " + guessesCount);
            } else {
            break;
            }

        }
        System.out.println("Congratulations, your guess is correct!");

    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
