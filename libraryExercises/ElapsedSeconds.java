package libraryExercises;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ElapsedSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("enter the date in “yyyy-mm-ddThh:mm:ss” format:");
            String input = scanner.nextLine();
            LocalDateTime today = LocalDateTime.now();
            LocalDateTime userDate = LocalDateTime.parse(input);
            long diff = java.time.Duration.between(userDate, today).getSeconds();
            System.out.println(diff + " seconds");
        } catch (java.time.format.DateTimeParseException e) {
            System.out.println("The date FORMAT is not correct!");
        }
    }
}
