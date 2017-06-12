
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name) {
        this.name = name;
        this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE), Calendar.getInstance().get(Calendar.MONTH) + 1,
                Calendar.getInstance().get(Calendar.YEAR));
    }

    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        int nowDay = Calendar.getInstance().get(Calendar.DATE);
        int nowMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int nowYear = Calendar.getInstance().get(Calendar.YEAR);

        int age = birthday.differenceInYears(new MyDate(nowDay, nowMonth, nowYear));

        return age;
    }

    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        boolean isThisObjOlder = this.birthday.earlier(compared.birthday);
        return isThisObjOlder;

    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
