/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis
 */
public class Person {
    
    private String name;
    private String phoneNumber;

    public Person(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return phoneNumber;
    }
    
    public void changeNumber(String number){
        this.phoneNumber = number;
    }
    @Override
    public String toString(){
     return name + "  number: " + phoneNumber;
     }
    
    
         
    
}
