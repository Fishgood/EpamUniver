package task5.ex1.view;

import task5.ex1.model.Entity.Student;

import java.util.ArrayList;

public class View implements Information {

    private final String[] params = {
            "surname",
            "name",
            "birthday",
            "phone number",
            "address"
    };

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printStudents(ArrayList<Student> arrayList) {
        arrayList.forEach(System.out::println);
    }

    public void printParam(int index) {
        System.out.println("Enter " + params[index] + ": ");
    }
}
