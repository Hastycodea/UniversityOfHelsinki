
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class Stack {

    private ArrayList<String> stackItems;

    public Stack() {
        this.stackItems = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (this.stackItems.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        this.stackItems.add(value);
    }

    public ArrayList<String> values() {
        return this.stackItems;
    }

    public String take() {
        String two = this.stackItems.remove(this.stackItems.size() - 1);

        //String one = this.stackItems.get(this.stackItems.size() - 1);
        return two;

    }

}
