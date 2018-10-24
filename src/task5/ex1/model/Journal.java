package task5.ex1.model;

import task5.ex1.model.Entity.Student;

import java.util.ArrayList;

public class Journal {

    private ArrayList<Student> student;

    public Journal() {
        this.student = new ArrayList<>();
    }

    public void addStudent(String[] arr){
        student.add(new Student(arr[0], arr[1], arr[2], arr[3], arr[4]));
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "student=" + student +
                '}';
    }
}
