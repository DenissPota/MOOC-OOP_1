
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        ArrayList<Student> list = new ArrayList<Student>();
        String inputName;
        String inputCode;
        String inputFind;

        while (true) {
            System.out.print("name:");
            inputName = reader.nextLine();
            if (inputName.isEmpty()) {
                break;
            }
            System.out.print("studentnumber:");
            inputCode = reader.nextLine();
            Student student = new Student(inputName, inputCode);
            list.add(student);

        }
        System.out.println("");
        for (Student s : list) {
            System.out.println(s.toString());

        }

        while (true) {
            System.out.print("Give search term:");
            inputFind = reader.nextLine();
            System.out.println("Result");

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getName().contains(inputFind)) {
                    System.out.println(list.get(i).toString());
                }
            }
            break;
        }

    }
}
