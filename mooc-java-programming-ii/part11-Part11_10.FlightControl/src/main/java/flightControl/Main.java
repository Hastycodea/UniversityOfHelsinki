package FlightControl;

import flightControl.logic.flightControl;
import flightControl.ui.TextUI;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        flightControl flight = new flightControl();
        Scanner scan = new Scanner(System.in);
        
        TextUI textUI = new TextUI(flight, scan);
        
        textUI.start();
    }
}
