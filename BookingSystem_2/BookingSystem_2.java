package BookingSystem_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingSystem_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<AllCourse> courseList = new ArrayList<>();
        List<String> currentSemester = new ArrayList<>();

        courseList.add(new Regular("java"));
        courseList.add(new Regular("Python"));

        courseList.add(new Irregular("HTML", List.of("Winter")));
        courseList.add(new Irregular("JavaScript", List.of("Summer")));

        courseList.add(new One_off("Github", List.of("Summer", "2020")));
        courseList.add(new One_off("Azure", List.of("Winter", "2020")));

        System.out.println("Which semester?");
        char command = scanner.next().toLowerCase().charAt(0);

        for (AllCourse elem : courseList) {
            for (String semester : elem.getcourseSemester()) {
                if (semester.toLowerCase().charAt(0) == command) {
                    currentSemester.add(elem.getcourseName());
                }
            }
        }
        System.out.println(currentSemester);
    }
}
