
public class NumberStatistics {

    private int amountOfNumbers;
    private int result;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
        this.result = 0;
    }

    public void addNumber(int number) {
        amountOfNumbers++;
        result += number;
    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }

    public int sum() {
        return result;
    }

    public double average() {
        if (amountOfNumbers != 0) {
            return (double) result / amountOfNumbers;
        } else {
            return 0;
        }

    }
}
