package task3.ex2.view;


import java.util.ArrayList;

public class View<T> implements information {

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public void printItems(ArrayList<T> items){
        items.forEach(System.out::println);
    }


    public void selectItem(int depIndex, ArrayList<T> items){
        View.printMessage(items.get(depIndex).toString());
    }

}
