
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dennis
 */
public class Inputter {

    Scanner scanner;
    Grader grader = new Grader();

    public Inputter(Scanner scanner) {
        this.scanner = scanner;
    }

    public Grader input() {
        System.out.println("Type exam scores, -1 completes:");
        int input = 0;
        while (true) {
            input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                break;
            }
            grader.addGrade(input);

        }

        grader.getGrades();
        return grader;

    }

    public void stats() {
        System.out.println("Grade distribution:");
        ArrayList<Integer> grades = gradingLogic(grader);
        int acceptedCount = 0;

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (Integer gr : grades) {
                String result = "";
                if (gr == i) {
                    result += "*";
                    if (gr > 0) {
                        acceptedCount++;
                    }
                }
                System.out.print(result);
            }
            System.out.println("");
        }
        System.out.println("Acceptance percentage: " + (double)(100*acceptedCount)/grades.size());

    }

    public ArrayList<Integer> gradingLogic(Grader grader) {

        ArrayList<Integer> mark = new ArrayList<Integer>();
        for (Integer points : grader.getGrades()) {
            if (points >= 0 && points <= 29) {
                mark.add(0);
            } else if (points >= 30 && points <= 34) {
                mark.add(1);
            } else if (points >= 35 && points <= 39) {
                mark.add(2);
            } else if (points >= 40 && points <= 44) {
                mark.add(3);
            } else if (points >= 45 && points <= 49) {
                mark.add(4);
            } else if (points >= 50 && points <= 60) {
                mark.add(5);

            }
        }
        return mark;
    }

}
