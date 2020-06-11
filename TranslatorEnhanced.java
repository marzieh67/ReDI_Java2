import java.util.*;

public class TranslatorEnhanced {
    Map<String, List<String>> dictionary = new HashMap<>();
    public static void main(String[] args) {
        TranslatorEnhanced translator= new TranslatorEnhanced();
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
                    translator.addTranslation(word, translation);
                    break;
                case 'T':
                    System.out.println("word");
                    word = scanner.nextLine();
                    translator.translate(word);
                    break;
                case 'R':
                    System.out.println("word");
                    word = scanner.nextLine();
                    System.out.println("translation");
                    translation = scanner.nextLine();
                    translator.removeTranslation(word, translation);
                    break;
            }
        } while (command != 'Q');
    }

    public void addTranslation(String word, String translation) {
        List<String> translationlist = dictionary.get(word);
        if (translationlist == null) {
            translationlist = new ArrayList<>();
            translationlist.add(translation);
            dictionary.put(word, translationlist);
        } else {
            if (!translationlist.contains(translation)) translationlist.add(translation);
        }
    }

    public List<String> translate(String word) {

        if (dictionary.containsKey(word)) {
            List translation = dictionary.get(word);
            System.out.println(word + ": " + translation);
            return translation;
        } else {
            System.out.println("Sorry, I do not know that word!");
            return null;
        }
    }

    public void removeTranslation(String word, String translation) {
        if (!dictionary.containsKey(word)) {
            System.out.println(word + " does not exist!");
        } else {
            List<String> translationlist = dictionary.get(word);
            translationlist.remove(translation);
            if (translationlist.isEmpty())
            {
                dictionary.remove(word);
            }
        }
    }

}
