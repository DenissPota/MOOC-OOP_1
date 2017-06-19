
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dennis
 */
public class Grader {

    private ArrayList<Integer> grades = new ArrayList<Integer>();

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade) {
        if (grade <= 60 && grade >= 0) {
            grades.add(grade);
        }
    }

}
