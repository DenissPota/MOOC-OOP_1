
import java.util.ArrayList;
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
    ArrayList<Bird> birds = new ArrayList<Bird>();

    public Inputter(Scanner scanner) {
        this.scanner = scanner;
    }

    public void input() {
        while (true) {
            System.out.print("? ");
            String input = scanner.nextLine();
            if (input.equals("Quit")) {
                break;
            } else if (input.equals("Add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Latin Name: ");
                String latinName = scanner.nextLine();
                add(new Bird(name, latinName));
                continue;
            } else if (input.equals("Observation")) {
                System.out.print("What was observed: ");
                String name = scanner.nextLine();
                observation(name);
                continue;
            } else if (input.equals("Statistics")) {
                statistics();
                continue;
            } else if (input.equals("Show")) {
                System.out.print("What: ");
                String name = scanner.nextLine();
                show(name);
                continue;
            }

        }
    }

    public void add(Bird bird) {
        birds.add(bird);
    }

    public void observation(String name) {

        for (int i = 0; i < birds.size(); i++) {
            if (birds.get(i).getName().equals(name)) {
                birds.get(i).increaseSelfCounter();
                return;
            }

        }
        System.out.println("This is not a bird!");

    }

    public void statistics() {
        for (Bird b : birds) {
            System.out.println(b.getName() + " (" + b.getLatinName() + ") : " + b.getSelfCounter() + " observations");
        }
    }

    public void show(String name) {
        for (Bird b : birds) {
            if (b.getName().equals(name)) {
                System.out.println(b.getName() + " (" + b.getLatinName() + ") : " + b.getSelfCounter() + " observations");
            }
        }

    }

}
