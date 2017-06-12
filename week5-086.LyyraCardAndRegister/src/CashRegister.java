
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;
    private final double ECONOMICAL_PRICE = 2.50;
    private final double GOURMET_PRICE = 4.00;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
        this.gourmetSold = 0;
        this.economicalSold = 0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens  

        if (cashGiven >= ECONOMICAL_PRICE) {
            cashInRegister += ECONOMICAL_PRICE;
            economicalSold++;
        }
        if (cashGiven < ECONOMICAL_PRICE) {
            return cashGiven;
        }

        return cashGiven - ECONOMICAL_PRICE;

    }

    public double payGourmet(double cashGiven) {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens

        if (cashGiven >= GOURMET_PRICE) {
            cashInRegister += GOURMET_PRICE;
            gourmetSold++;
        }
        if (cashGiven < GOURMET_PRICE) {
            return cashGiven;
        }
        return cashGiven - GOURMET_PRICE;

    }

    public boolean payEconomical(LyyraCard card) {
        // the price of the economical lunch is 2.50 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false

        if (card.balance() >= ECONOMICAL_PRICE) {
            economicalSold++;
            card.pay(ECONOMICAL_PRICE);
            return true;
        } else {
            return false;
        }
    }

    public boolean payGourmet(LyyraCard card) {
        // the price of the gourmet lunch is 4.00 euros
        // if the balance of the card is at least the price of the lunch:
        //    the amount of sold lunches is incremented by one
        //    the method returns true
        // if not, the method returns false
        if (card.balance() >= GOURMET_PRICE) {
            gourmetSold++;
            card.pay(GOURMET_PRICE);
            return true;
        } else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
