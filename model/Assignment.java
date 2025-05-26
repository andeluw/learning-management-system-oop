package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Assignment {
    private String title;
    private Date dueDate;
    private List<Question> questions = new ArrayList<>();

    public Assignment(String title, Date dueDate) {
        this.title = title;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }
}
