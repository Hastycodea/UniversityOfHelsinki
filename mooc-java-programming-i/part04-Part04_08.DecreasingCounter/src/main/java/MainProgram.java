
public class MainProgram {

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(6);

        counter.printValue();
        counter.decrement();
        
        counter.printValue();
        counter.decrement();
        
        counter.printValue();
        counter.reset();
        
        counter.printValue();
    }
}
