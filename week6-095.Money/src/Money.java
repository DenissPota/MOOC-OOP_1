
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money added) {
        return new Money(this.euros + added.euros, this.cents + added.cents);
    }

    public boolean less(Money compared) {
        if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            }
        }
        return this.euros < compared.euros;
    }

    public Money minus(Money decremented) {
        int euroDif = this.euros - decremented.euros;
        int centsDiff = this.cents - decremented.cents;
        if (centsDiff < 0) {
            centsDiff = 100 - Math.abs(centsDiff);
            euroDif--;
        }

        if (euroDif < 0) {
            centsDiff = 0;
            euroDif = 0;
        }

        Money result = new Money(euroDif, centsDiff);
        return result;

    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
