import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        char command;
        do {
            System.out.println("What do you want to do? [A]dd, [T]ranslate, [Q]uit");
            command = scanner.nextLine().toUpperCase().charAt(0);
            switch (command) {
                case 'A':
                    System.out.println("word");
                    String word = scanner.nextLine();
                    System.out.println("translation");
                    String translation = scanner.nextLine();
                    addTranslation(word, translation, dictionary);
                    break;
                case 'T':
                    System.out.println("word");
                    word = scanner.nextLine();
                    translate(word, dictionary);
                    break;
            }
        } while (command != 'Q');

    }

    public static void addTranslation(String word, String translation, Map<String, String> dictionary) {

        if (dictionary.containsKey(word)) {
            System.out.println("This word is already there:" + dictionary.get(word));
        } else
            dictionary.put(word, translation);
    }

    public static String translate(String word, Map<String, String> dictionary) {

        if (dictionary.containsKey(word)) {
            String translation = dictionary.get(word);
            System.out.println(word+": "+translation);
            return translation;
        } else {
            System.out.println("Sorry, I do not know that word!");
            return null;
        }
    }
}
