package task2.ex2.controller;

import task2.ex2.model.Data;
import task2.ex2.model.Figures;
import task2.ex2.view.FiguresView;

public class Controller {

    private Figures model = new Figures();
    private FiguresView view = new FiguresView();

    public void run() {

        model.setShapes(Data.getFigures());
        view.printFigures("All figures: ", model.getShapes());
        view.printResult("Total area of all figures: ", model.getTotalArea());
        view.printResult("Total area of certain figures: ",
                model.getTotalAreaOfCertainFigure("Triangle"));

        view.printFigures("Sorted list of figures by area: ", model.getSortedFiguresListByArea());
        view.printFigures("Sorted list of figures by colour: ", model.getSortedFiguresListByColour());

        view.drawAllFigures(model.getShapes());
    }


}
