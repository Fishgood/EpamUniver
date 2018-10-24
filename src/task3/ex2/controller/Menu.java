package task3.ex2.controller;

import task3.ex2.Utility.InputUtility;
import task3.ex2.model.Entity.*;
import task3.ex2.model.Shop;
import task3.ex2.view.View;

import java.lang.reflect.Field;
import java.util.*;

public class Menu<T> {

    private Scanner scanner = new Scanner(System.in);
    private View view = new View();
    private Shop shop = new Shop("Adidas");

    public void menu() {
        View.printMessage(View.MAIN_MENU);
        int option;
        while (true) {
            View.printMessage("Select next option: ");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    View.printMessage("All departments: ");
                    view.printItems(shop.getDepartments());
                    break;
                case 2:
                    shop.sortDepartments();
                    break;
                case 3:
                    View.printMessage("Enter department index: ");
                    int depIndex = scanner.nextInt();
                    view.selectItem(depIndex, shop.getDepartments());
                    departmentMenu(depIndex);
                    break;
                case 4:
                    shop.addDepartment(InputUtility.inputString("Enter department name: "));
                    break;
                case 5:
                    View.printMessage("Enter department name: ");
                    shop.deleteDepartment(InputUtility.strValInp(scanner.nextLine()));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println(View.WRONG_INPUT);
            }
        }
    }

    public void departmentMenu(int depIndex) {
        View.printMessage(View.DEPARTMENT_MENU);
        int option1;
        String ex;
        while (true) {
            View.printMessage("Select next option: ");
            option1 = scanner.nextInt();
            switch (option1) {
                case 1:
                    view.printItems(shop.getItems(depIndex));
                    break;
                case 2:
                    shop.sortItemsByName(depIndex);
                    break;
                case 3:
                    shop.sortItemsByPrice(depIndex);
                    break;
                case 4:
                    int num;

                    do {
                        do {
                            num = enterItemType();
                        } while (!(num > 0 && num < 5));
                        Actions.initItem(shop.getItems(depIndex), num, getFields(num));
                        View.printMessage("Want to add one more item?(y/n): ");
                        ex = scanner.next();
                    } while (!ex.equals("n"));
                    break;
                case 5:
                    View.printMessage("Enter name of item: ");
                    shop.deleteItem(scanner.next().trim(), depIndex);
                    break;
                case 0:
                    menu();
                    break;
                default:
                    System.out.println(View.WRONG_INPUT);
            }
        }
    }

    private int enterItemType() {
        View.printMessage("Pick type (Clothes, Electronics, Shoes or Stationery)\n");
        switch (scanner.next().trim()) {
            case "Clothes":
                return 1;
            case "Electronics":
                return 2;
            case "Shoes":
                return 3;
            case "Stationery":
                return 4;
            default:
                View.printMessage("no such type");
                return 0;
        }
    }

    private Field[] getFields(int num) {
        View.printMessage("Pick type (Clothes, Electronics, Shoes or Stationery)\n");

        switch (num) {
            case 1:
                return Clothes.class.getDeclaredFields();
            case 2:
                return Electronics.class.getDeclaredFields();
            case 3:
                return Shoes.class.getDeclaredFields();
            case 4:
                return Stationery.class.getDeclaredFields();
        }

        return null;
    }
}
