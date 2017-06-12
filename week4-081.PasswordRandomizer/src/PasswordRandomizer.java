import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random random;
    private int lowerBound = 97;
    private int upperBound = 122;
    
    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String result = "";
        
        for (int i = 0; i < length;i++){
            result += (char)(random.nextInt(upperBound-lowerBound)+lowerBound);
        }
        return result;
    }
}
