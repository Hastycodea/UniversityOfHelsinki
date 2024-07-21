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
        int i = 0;
        while (i < lists.size()) {
            System.out.println(i+1 + ": " + lists.get(i));
            i++;
        }
    }
    
    public void remove(int number) {
        int index = number - 1;
        lists.remove(index);
    }
    
}
