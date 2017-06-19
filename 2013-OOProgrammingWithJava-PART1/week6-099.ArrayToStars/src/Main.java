
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};

        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        String star = "*";

        for (int i : array) {
            System.out.println(starMultiplicator(i));
        }
    }

    public static String starMultiplicator(int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result += "*";
        }
        return result;
    }
}
