
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {
        count = 0;
    }

    public void addNumber(int number) {
        // write code here
        count++;
        sum += number;
    }

    public int getCount() {
        // write code here
        return count;
    }

    public int sum() {
        // write code here
        return sum;
              
    }

    public double average() {
        // write code here
        if (count == 0) {
            return 0;
        }
        return sum * 1.0 / count;
    }

    
}
