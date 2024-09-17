package models;
import java.util.ArrayList;
public class Student {
    public int id,roll,grade;
    public String name,section;
    public ArrayList<String> subject;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public ArrayList<String> getSubject() {
        return subject;
    }

    public void setSubject(ArrayList<String> subject) {
        this.subject = subject;
    }

    public Student(int id, int roll, int grade, String name, String section, String subject) {
        this.id = id;
        this.roll = roll;
        this.grade = grade;
        this.name = name;
        this.section = section;
        this.subject = new ArrayList<>();
    }
}

