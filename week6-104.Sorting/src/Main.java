
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

    public static int smallest(int[] array) {
        int min = Integer.MAX_VALUE;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }

    public static int indexOfTheSmallest(int[] array) {
        int min = Integer.MAX_VALUE;
        int temp = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            if (temp < min) {
                min = temp;
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int min = Integer.MAX_VALUE;
        int temp = 0;
        int indexToReturn = 0;
        for (int i = index; i < array.length; i++) {
            temp = array[i];
            if (temp < min) {
                min = temp;
                indexToReturn = i;
            }
        }
        return indexToReturn;
    }

    public static void swap(int[] array, int index1, int index2) {

        int valueAtIndex1;
        int valueAtIndex2;
        valueAtIndex1 = array[index2];
        valueAtIndex2 = array[index1];

        array[index1] = valueAtIndex1;
        array[index2] = valueAtIndex2;

    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int indexOfSmallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, indexOfSmallest);

        }

    }
}
