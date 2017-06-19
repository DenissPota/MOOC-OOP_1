/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis
 */
public class Book {
    
    private String title, publisher;
    private int year;

    public Book(String title, String published, int year) {
        this.title = title;
        this.publisher = published;
        this.year = year;
    }

    public String title() {
        return title;
    }

    public String publisher() {
        return publisher;
    }

    public int year() {
        return year;
    }
    
    @Override
    public String toString(){
    return title + ", " + publisher + ", " + year;
    
    }
    
    
           
    
}
