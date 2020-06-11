package BookingSystem_2;

import java.util.List;

public abstract class AllCourse {
    private String coursename;
    private List<String> courseSemester;

    public AllCourse(String coursename, List<String> courseSemester) {
        this.coursename = coursename;
        this.courseSemester = courseSemester;
    }

    public String getcourseName() {
        return coursename;
    }

    public List<String> getcourseSemester() {
        return courseSemester;
    }
}
