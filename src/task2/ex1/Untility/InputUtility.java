package task2.ex1.Untility;

import task2.ex1.view.BooksView;

import java.util.Scanner;

public class InputUtility {

    private Scanner sc = new Scanner(System.in);

    public String inputStringValue(){

        while (true) {
            if (sc.hasNext()){
                sc.nextLine();
                return sc.nextLine();
            }
            BooksView.printMessage(BooksView.WRONG_INPUT);
        }
    }

    public int inputInt(){
        BooksView.printMessage(BooksView.INPUT_VALUE);
        while (!sc.hasNextInt()) {
            BooksView.printMessage(BooksView.WRONG_INPUT);

            sc.next();
        }
        return sc.nextInt();
    }

    public int inputIntBetween(int end){
        BooksView.printMessage(BooksView.INPUT_VALUE);
        while (!sc.hasNextInt() && !(sc.nextInt() >= 0) && !(sc.nextInt() <= end)) {
            BooksView.printMessage(BooksView.WRONG_INPUT);

            sc.next();
        }
        return sc.nextInt();
    }
}
