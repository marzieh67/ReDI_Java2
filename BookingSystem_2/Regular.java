package BookingSystem_2;

import java.util.List;

public class Regular extends AllCourse {

    public Regular(String courseName) {
        super(courseName, List.of("S", "W"));
    }
}
