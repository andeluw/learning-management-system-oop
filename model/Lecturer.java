package model;

import java.util.ArrayList;
import java.util.List;

public class Lecturer extends User {
    private String employeeId;
    private List<Course> coursesTaught = new ArrayList<>();

    public Lecturer(String name, String email, String password, String employeeId) {
        super(name, email, password);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public List<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public void addCourse(Course course) {
        coursesTaught.add(course);
        System.out.println("Course " + course.getTitle() + " added to lecturer's courses.");
    }

    public void removeCourse(Course course) {
        coursesTaught.remove(course);
        System.out.println("Course " + course.getTitle() + " removed from lecturer's courses.");
    }

    @Override
    public boolean login() {
        System.out.println("Lecturer " + name + " logged in.");
        return true;
    }
}
