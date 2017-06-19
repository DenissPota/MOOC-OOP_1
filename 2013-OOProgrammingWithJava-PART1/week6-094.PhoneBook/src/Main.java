
public class Main {

    public static void main(String[] args) {
        Phonebook p = new Phonebook();
        p.add("Pekka", "040-123654");
        p.add("Jukka", "045-332211");
        System.out.println(p.searchNumber("Jukka"));
    }
    
}
