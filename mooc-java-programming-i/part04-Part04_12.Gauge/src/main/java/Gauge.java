/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Gauge {

    private int value;

    public Gauge() {

    }

    public void decrease() {
        while (this.value > 0) {
            this.value--; 
        }

    }

    public void increase() {
        if (this.value < 5) {
            this.value++;
        }

    }

    public int value() {
        return this.value;
    }

    public boolean full() {
        return this.value == 5;
    }

}
