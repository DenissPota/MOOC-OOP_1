public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }
    
     public int differenceInYears(MyDate comparedDate){
         int yearDifference = this.year - comparedDate.year; //10
         int monthDifference = this.month - comparedDate.month; //1
         int dayDifference = this.day - comparedDate.day; //1
         int counter = 0;
         
   
         int convertionToDays = Math.abs(yearDifference*365 + monthDifference*30 + dayDifference);

         System.out.println(convertionToDays);
         while (convertionToDays >= 365){
             convertionToDays -= 365;
             counter++;
         }
         
         
         return counter;
         
     }

}
