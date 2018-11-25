package task1.ex1;

class Controller {
    private Model model;
    private View view;

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    void calculate() {
        model.setOption(InputUtility.inputOptionOfCalculating(view, model.numOfOptions));
        model.setValue(Integer.toString(InputUtility.inputIntValueWithScanner(view)));
        model.calculate();
        view.printMessageAndResult(view.OUR_INT, model.getValue());
    }
}
