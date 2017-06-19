
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {14, 5, 129, 62, 
        4, 48, 59, 62, 49, 8, 7, 65, 137, 66, 106, 139, 64, 90, 55, 46, 126, 101, 64, 21, 112, 148, 62, 148, 30, 87, 134, 11, 114, 93, 70, 144, 10, 59, 54, 137, 76, 53, 110, 85, 86, 112, 115, 57, 118, 44, 27, 115, 92, 25, 98, 113, 92, 17, 85, 41, 101, 107, 134, 84, 51, 137, 83, 145, 
        38, 148, 114, 49, 72, 62, 63, 
        107, 87, 6, 98, 34, 61, 52, 
        78, 89, 40, 67, 43, 48, 34, 20, 
        80, 109, 2, 24, 111, 108, 11, 121, 5, 49};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here

        for (int i : array) {
            if (i == array[array.length -1]) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}
