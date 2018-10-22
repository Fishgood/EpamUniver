package task3.ex1.view;

public class View implements Inforamtion{

    public void printToys(String message, Object[] objects) {
        System.out.println(message);
        if (!(objects.length == 0)) {
            for (Object o : objects) {
                System.out.println(o);
            }
        } else System.out.println(" no such book with " + message);
    }

    public void printResult(String messege, double value){
        System.out.println(messege + value);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
