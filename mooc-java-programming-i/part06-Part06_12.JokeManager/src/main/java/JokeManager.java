
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<> ();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        String result;
        if (this.jokes.isEmpty()) {
            result = "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(this.jokes.size());
            result = this.jokes.get(index);
        }
        return result;
    }

    public void printJokes() {
        for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }
}
