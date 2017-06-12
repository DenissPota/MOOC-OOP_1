
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        String result = "";
        for (int i = 1; i <= amount; i++) {
            result += "*";
        }
        System.out.println(result);
    }

    public static void printWhitespaces(int amount) {
        String result = "";
        for (int i = 0; i < amount; i++) {
            result += " ";
        }
        System.out.print(result);
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printWhitespaces(size - i);
            printStars(i);
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        for (int i = 1, j = 1; j <= height; i += 2, j++) {
            printWhitespaces(height - j);
            printStars(i);
        }
        for (int z = 0; z < 2; z++) {
            printWhitespaces(height - 2);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        xmasTree(10);
    }
}
