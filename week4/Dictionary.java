package week4;

import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> translations;

    public Dictionary() {
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }

    public String translate(String word) {
        return this.translations.get(word);
    }

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        System.out.println(dictionary.translate("cembalo"));
        System.out.println(dictionary.translate("porkkana"));
    }
}
