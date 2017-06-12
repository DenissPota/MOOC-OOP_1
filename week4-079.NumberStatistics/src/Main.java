
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.
        // The tests does not work if you do not create the objects in the correct order
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        
        
        System.out.println("Type numbers:");
        int number = 0;

       
        while (number != -1) {
           number = Integer.parseInt(reader.nextLine());
            if (number != -1) {
                stats.addNumber(number);
 
                if (number % 2 == 0) {
                even.addNumber(number);
                } else if(number % 2 == 1){
                odd.addNumber(number);
                }
                
            }
            

        }

        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
    }
}
