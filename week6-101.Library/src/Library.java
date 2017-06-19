
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dennis
 */
public class Library {

    private List<Book> bookList = new ArrayList<Book>();

    public void addBook(Book newBook) {
        bookList.add(newBook);
    }

    public void printBooks() {
        for (Book b : bookList) {
            System.out.println(b);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> matched = new ArrayList<Book>();

        for (Book b : bookList) {
            if (StringUtils.included(b.title(), title)) {
                matched.add(b);
            }
        }
        return matched;
    }
    
    public ArrayList<Book> searchByPublisher(String pub) {
        ArrayList<Book> matched = new ArrayList<Book>();

        for (Book b : bookList) {
            if (StringUtils.included(b.publisher(), pub)) {
                matched.add(b);
            }
        }
        return matched;
    }
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> matched = new ArrayList<Book>();

        for (Book b : bookList) {
            if (b.year() == year) {
                matched.add(b);
            }
        }
        return matched;
    }
    
}
