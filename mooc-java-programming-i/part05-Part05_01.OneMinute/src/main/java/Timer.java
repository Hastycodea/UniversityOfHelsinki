/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Timer {
    private ClockHand seconds;
    private ClockHand centiSeconds;
    
    public Timer() {
          this.seconds = new ClockHand (60);
          this.centiSeconds = new ClockHand (100);
    }
    
    public void advance() {
        this.centiSeconds.advance();
        
        if (this.centiSeconds.value() == 0) {
            this.seconds.advance();
        }
    }
    
    @Override
    public String toString() {
        return seconds + ":" + centiSeconds;
    }

}
