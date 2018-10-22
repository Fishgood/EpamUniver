package task3.ex2.controller;

import task3.ex2.Utility.InputUtility;
import task3.ex2.model.Entity.Item;
import task3.ex2.model.Shop;
import task3.ex2.view.View;

import java.util.*;

public class Menu<T> {

    private Scanner scanner = new Scanner(System.in);
    private View view = new View();
    private InputUtility inputUtility = new InputUtility();
    private Shop shop = new Shop("Adidas");

    public void menu(int option){
        View.printMessage(View.MAIN_MENU);
        option = scanner.nextInt();
        while (true){
            switch (option){
                case 1:
                    View.printMessage("All departments: ");
                    view.printItems(shop.getDepartments());
                    break;
                case 2:
                    shop.sortDepartments();
                case 3:
                    View.printMessage("Enter department index: ");
                    option = scanner.nextInt();
                    view.selectItem(option, shop.getDepartments());
                    departmentMenu();
                    break;
                case 4:
                    shop.addDepartment();
                    break;
                case 5:
                    shop.deleteDepartment(InputUtility.strValInp(scanner.nextLine()));
                    break;
                case 0: System.exit(0);
                default:
                    System.out.println(View.WRONG_INPUT);

            }

        }
    }

    public void departmentMenu(int depIndex){
        View.printMessage(View.DEPARTMENT_MENU);
        int option1 = scanner.nextInt();
        String ex;
        do {
            switch (option1){
                case 1:
                    view.printItems(shop.getItems());
                    break;
                case 2:
                    view.printItems(shop.getItems().sort(Comparator.comparing(Item::getName)).);
            }

            View.printMessage("Want to add one more item?(y/n): ");
            ex = scanner.nextLine();
        } while (ex.equals("n"));
    }
}
