
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int last;
        int max = -1000;

        int[] list = new int[3];
        list[0] = number1;
        list[1] = number2;
        list[2] = number3;

        for (int i = 0; i < list.length; i++) {

            last = list[i];
            if (max < list[i]) {
                max = list[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
