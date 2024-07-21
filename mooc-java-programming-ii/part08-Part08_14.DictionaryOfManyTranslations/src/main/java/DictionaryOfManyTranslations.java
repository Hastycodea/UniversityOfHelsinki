
import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.translations.putIfAbsent(word, new ArrayList<>());
        this.translations.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
//        ArrayList<String> trans = new ArrayList<>();
        for (String search : this.translations.keySet()) {
            if (search.contains(word)) {
                return translations.get(word);
            }
        }
        return new ArrayList<>();
    }

    public void remove(String word) {
        this.translations.remove(word);
    }
}

