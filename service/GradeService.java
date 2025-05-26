package service;

import model.Assignment;
import model.Student;
import model.Course;

public class GradeService {
    public double calculateFinalGrade(Student student, Course course) {
        System.out.println("Calculating final grade...");
        return 90.0;
    }

    public double calculateAssignmentScore(Student student, Assignment assignment) {
        System.out.println("Calculating final grade...");
        return 95.0;
    }

    public String generateTranscript(Student student) {
        return "Transcript for student: " + student;
    }
}
