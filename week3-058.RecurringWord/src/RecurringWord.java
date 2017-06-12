
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        System.out.print("Type a word: ");

        while (true) {
            String word = reader.nextLine();

            System.out.print("Type a word: ");
            if (words.contains(word)) {
                words.add(word);
                break;
            }
            words.add(word);
        }
        System.out.println("You gave the word " + words.get(words.size()-1) +" twice ");
        
        

    }
}
