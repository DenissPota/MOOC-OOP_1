/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis
 */
public class Counter {

    private boolean check;
    private int value;

    public int value() {
        return value;
    }

    public void increase() {
        value++;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            value += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            if (check == true) {
                if (value - decreaseAmount > 0) {
                    value -= decreaseAmount;
                } else {
                value = 0;
                }
            } else {
                value -= decreaseAmount;
            }
        }
    }

    public void decrease() {
        if (check == true) {
            if (value > 0) {
                value--;
            }
        } else {
            value--;
        }
    }

    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, true);
    }

    public Counter() {
        this(0, false);
    }
}
