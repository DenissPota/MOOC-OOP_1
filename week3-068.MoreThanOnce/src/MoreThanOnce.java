
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MoreThanOnce {

    public static boolean moreThanOnce(ArrayList<Integer> list, int searched) {
        Collections.sort(list);
        int searchedCounter = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == searched) {
                searchedCounter++;
            }
        }
        if (searchedCounter > 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (moreThanOnce(list, number)) {
            System.out.println(number + " appears more than once.");
        } else {
            System.out.println(number + " does not appear more than once. ");
        }
    }
}
