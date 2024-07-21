import java.util.ArrayList;


public class TodoList {
    private ArrayList<String> lists;
    
    public TodoList() {
        this.lists = new ArrayList<>();
    }
    
    public void add(String task) {
        this.lists.add(task);
    }
    
    public void print() {
        int index = 1;
        for (String list : lists) {
            System.out.println(index +": " + list);
            index++;
        }
    }
    
    public void remove(int number) {
        if (number > 0 && number <= lists.size()) {
            lists.remove(number - 1);
        } else {
            System.out.println("Invalid number");
        }
    }
}
