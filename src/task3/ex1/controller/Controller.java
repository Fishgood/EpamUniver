package task3.ex1.controller;

import task3.ex1.model.Data;
import task3.ex1.model.Toys;
import task3.ex1.view.View;

public class Controller {

    private Toys model = new Toys();
    private View view = new View();

    public void run(){
        model.setToys(Data.getToys());
        view.printToys(View.ALL_TOYS, model.getToys());
        view.printToys(View.SORT_BY_PRICE, model.sortByPrice());
        view.printResult(View.TOTAL_PRICE, model.getTotalPrice());
        view.printToys(View.PRICE_BETWEEN_YEARS, model.getToysBetweenYears(2015, 2018));

    }
}
