package model;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String code;
    private String title;
    private String schedule;
    private List<Assignment> assignments = new ArrayList<>();

    public Course(String code, String title, String schedule) {
        this.code = code;
        this.title = title;
        this.schedule = schedule;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public void removeAssignment(Assignment assignment) {
        assignments.remove(assignment);
    }
}
