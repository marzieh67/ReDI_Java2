import java.util.*;

public class TranslatorEnhanced {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        char command;
        do {
            System.out.println("What do you want to do? [A]dd, [T]ranslate, [R]emove, [Q]uit");
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
                case 'R':
                    System.out.println("word");
                    word = scanner.nextLine();
                    System.out.println("translation");
                    translation = scanner.nextLine();
                    removeTranslation(word, translation, dictionary);
                    break;
            }
        } while (command != 'Q');
        System.out.println(dictionary);
    }

    public static void addTranslation(String word, String translation, Map<String, ArrayList<String>> dictionary) {
        List<String> translationlist = dictionary.get(word);
        if (translationlist == null) {
            translationlist = new ArrayList<>();
            translationlist.add(translation);
            dictionary.put(word, (ArrayList<String>) translationlist);
        } else {
            if (!translationlist.contains(translation)) translationlist.add(translation);
        }
    }

    public static List<String> translate(String word, Map<String, ArrayList<String>> dictionary) {

        if (dictionary.containsKey(word)) {
            List translation = dictionary.get(word);
            System.out.println(word + ": " + translation);
            return translation;
        } else {
            System.out.println("Sorry, I do not know that word!");
            return null;
        }
    }

    public static void removeTranslation(String word, String translation, Map<String, ArrayList<String>> dictionary) {
        if (!dictionary.containsKey(word)) {
            System.out.println(word + " does not exist!");
        } else {
            List<String> translationlist = dictionary.get(word);
            translationlist.remove(translation);
        }
    }

}
