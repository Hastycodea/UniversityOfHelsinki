
import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> name;

    public Abbreviations() {
        this.name = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        name.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.name.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        if (this.name.containsKey(abbreviation)) {
            String explanation = this.name.get(abbreviation);
            return explanation;
        } else {
            return null;
        }
    }
}
