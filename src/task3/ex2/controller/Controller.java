package task3.ex2.controller;

import task3.ex2.Utility.InputUtility;
import task3.ex2.model.Shop;
import task3.ex2.view.View;

public class Controller {

    private View view = new View();
    private InputUtility inputUtility = new InputUtility();
    private Shop model = new Shop("Adidas");
    private Menu menu = new Menu();

    public void run(){

        menu.menu();


    }
}
