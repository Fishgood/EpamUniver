package task3.ex1.controller;

import task3.ex1.model.Data;
import task3.ex1.model.Toys;
import task3.ex1.view.View;

public class Controller {

    private Toys model = new Toys();
    private View view = new View();

    public void run(){
        model.setToys(Data.getToys());
        view.printToys("All toys: ", model.getToys());
        view.printToys("Sort toys by price: ", model.sortByPrice());
        view.printResult("Total price: ", model.getTotalPrice());
        view.printToys("Toys with year between 2015 and 2018: ", model.getToysBetweenYears(2015, 2018));

    }
}
