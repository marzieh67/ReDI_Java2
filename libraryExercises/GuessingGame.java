package libraryExercises;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int correct = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        System.out.println("Guess a number between 0 and 100");
        do {
            try {
                guess = Integer.parseInt(scanner.nextLine());
                if (guess > correct) {
                    System.out.println("too high! guess again...");
                } else if (guess < correct) {
                    System.out.println("too low! guess again...");
                }
            } catch (java.lang.NumberFormatException e) {
                System.out.println("Guess a NUMBER between 0 and 100");
            }
        } while (correct != guess);
        System.out.println("Correct!");
    }
}
