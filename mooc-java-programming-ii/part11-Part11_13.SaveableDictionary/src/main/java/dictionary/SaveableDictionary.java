package dictionary;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {

    private String file;
    private HashMap<String, String> dictionary;

    // Constructor that accepts a file name
    public SaveableDictionary(String file) {
        this.file = file;
        this.dictionary = new HashMap<>(); // Initialize the dictionary
    }

    // Default constructor
    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    // Method to load the dictionary from a file
    public boolean load() {
        try (Scanner fileReader = new Scanner(Paths.get(this.file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");

                if (parts.length == 2) {
                    String name = parts[0].trim();
                    String translation = parts[1].trim();
                    this.add(name, translation);
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // Method to save the dictionary to a file
    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.file)) {
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                writer.println(entry.getKey() + ":" + entry.getValue());
            }
            return true;
        } catch (Exception e) {
            System.err.println("Failed to save dictionary: " + e.getMessage());
            return false;
        }
    }

    // Method to add a word and its translation to the dictionary
    public void add(String words, String translation) {
        dictionary.putIfAbsent(words, translation);
    }

    // Method to translate a word
    public String translate(String word) {
        for (String w : dictionary.keySet()) {
            if (word.equals(w)) {
                return dictionary.get(w);
            }
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                if (entry.getValue().equals(word)) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }

    // Method to delete a word or its translation from the dictionary
    public void delete(String word) {
        if (dictionary.containsKey(word)) {
            dictionary.remove(word);
        } else {
            Iterator<Map.Entry<String, String>> iterator = dictionary.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                if (entry.getValue().equals(word)) {
                    iterator.remove();
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        SaveableDictionary s = new SaveableDictionary("word.txt");
        System.out.println(s.load()); // Should return true if the file is correctly loaded
    }
}
