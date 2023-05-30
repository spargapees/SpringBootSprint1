package kz.bitlab.springboot.techboot.db;

import java.util.ArrayList;

public class DBManager {
    static Long index = 3L;
    private static ArrayList<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1L, "Berik", "Serik", 91, "A"));
        students.add(new Student(2L, "Assan", "Yessen", 49, "F"));
    }

    public static ArrayList<Student> getStudents(){
        return students;
    }
    public static void addStudent(Student student) {
        student.setId(index++);
        if (student.getExam() >= 90) student.setMark("A");
        else if (student.getExam() >= 75) student.setMark("B");
        else if (student.getExam() >= 60) student.setMark("C");
        else if (student.getExam() >= 50) student.setMark("D");
        else student.setMark("F");
        students.add(student);
    }
}
