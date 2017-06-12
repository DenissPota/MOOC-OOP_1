/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis
 */
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        if (value < upperLimit) {
            value++;
        } else {
            value = 0;
        }
    }

    public String toString() {
        // write code here
        if (value < 10) {
            return "0" + value;
        }
        return "" + value;
    }

    public int getValue() {
        // write here code that returns the value
        return value;
    }

    public void setValue(int value) {
        // write here code that returns the value
        if (value >= 0 && value <= upperLimit) {
            this.value = value;
        }
    }
}
