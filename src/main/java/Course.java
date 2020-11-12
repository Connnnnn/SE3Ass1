import org.joda.time.DateTime;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<Modules> modules;
    private ArrayList<Student> studentsEnrolled;
    private DateTime startDate;
    private DateTime endDate;

    public Course(String courseName, ArrayList<Modules> modules, ArrayList<Student> studentsEnrolled, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.modules = modules;
        this.studentsEnrolled = studentsEnrolled;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Modules> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Modules> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(ArrayList<Student> studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}
