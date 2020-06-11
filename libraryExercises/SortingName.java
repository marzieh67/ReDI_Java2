package libraryExercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortingName {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("name:");
            String name = scanner.nextLine();
            if (name.length() == 0) {
                break;
            }
            try {
                System.out.println("age:");
                String ageString = scanner.nextLine();      //problem with scanner for age as int
                int age = Integer.parseInt(ageString);
                people.put(name, age);
            } catch (java.lang.NumberFormatException e) {
                System.out.println("add a valid number a age");
            }
        }
        System.out.println("people are: " + people);
        System.out.println("*sorted names by age:");
        people.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
