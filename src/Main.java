import models.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1000, 25006, 12, "Ram", "Khumbilla", "Maths");
        Student student2 = new Student(1001, 25007, 11, "Sam", "Yala", "English");


        System.out.println(student1.getName());
        System.out.println(student1.getRoll());
        System.out.println(student1.getGrade());
        System.out.println(student1.getSection());
        System.out.println(student1.getSubject());


        System.out.println(student2.getName());
        System.out.println(student2.getRoll());
        System.out.println(student2.getGrade());
        System.out.println(student2.getSection());
        System.out.println(student2.getSubject());

    }
}
