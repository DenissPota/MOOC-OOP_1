
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
public class Phonebook {

    private ArrayList<Person> personsInPhoneBook = new ArrayList<Person>();

    public void add(String name, String number) {
        personsInPhoneBook.add(new Person(name, number));
    }

    public void printAll() {

        for (Person p : personsInPhoneBook) {
            System.out.println(p);
        }

    }

    public String searchNumber(String name) {
        for (Person p : personsInPhoneBook) {
            if (name.equals(p.getName())){
                return p.getNumber();
            } 
        }
        return "number not known";
    }

}
