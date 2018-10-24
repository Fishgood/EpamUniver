package task3.ex3.view;

import task3.ex3.model.Enum;
import task3.ex3.model.Weak;

public class View {

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public void printWeak(String message){
        System.out.println(message);
        System.out.println(Weak.MONDAY.getName() + " " + Weak.MONDAY.getOrdinal());
        System.out.println(Weak.TUESDAY.getName() + " " + Weak.TUESDAY.getOrdinal());
        System.out.println(Weak.WEDNESDAY.getName() + " " + Weak.WEDNESDAY.getOrdinal());
        System.out.println(Weak.THURSDAY.getName() + " " + Weak.THURSDAY.getOrdinal());
        System.out.println(Weak.FRIDAY.getName() + " " + Weak.FRIDAY.getOrdinal());
        System.out.println(Weak.SATURDAY.getName() + " " + Weak.SATURDAY.getOrdinal());
        System.out.println(Weak.SUNDAY.getName() + " " + Weak.SUNDAY.getOrdinal() + "\n");

        System.out.println(Weak.SUNDAY.equals(Weak.ANOTHER_SUNDAY));
        System.out.println(Weak.SATURDAY.compareTo(Weak.MONDAY));
        System.out.println(Enum.valueOf("WEDNESDAY"));
    }
}
