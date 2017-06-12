public class Main {
    public static void main(String[] args) {
        // write testcode here
        
        
        Counter c = new Counter();
        System.out.println(c.value());
        
        Counter d = new Counter(100, true);
        d.decrease();
        d.decrease(50);
        System.out.println(d.value());
        
    }
}
