package model;

public class Question {
    private String text;
    private String type;
    private int points;

    public Question(String text, String type, int points) {
        this.text = text;
        this.type = type;
        this.points = points;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void updateText(String newText) {
        this.text = newText;
    }
}
