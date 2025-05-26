package model;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private String studentId;
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String name, String email, String password, String studentId) {
        super(name, email, password);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enroll(Course course) {
        enrolledCourses.add(course);
        System.out.println("Enrolled in course: " + course.getTitle());
    }

    public void dropCourse(Course course) {
        enrolledCourses.remove(course);
        System.out.println("Dropped course: " + course.getTitle());
    }

    public void tutorStudent(Student peer) {
        System.out.println("Tutoring student: " + peer.studentId);
    }

    @Override
    public boolean login() {
        System.out.println("Student " + name + " logged in.");
        return true;
    }
}
