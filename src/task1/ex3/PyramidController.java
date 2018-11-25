package task1.ex3;

class PyramidController {
    private PyramidModel model;
    private PyramidView view;

    PyramidController(PyramidModel model, PyramidView view) {
        this.model = model;
        this.view = view;
    }

    void calculate() {
        model.setValue(InputUtility.inputIntValueWithScanner(view));
        view.printMessageAndResult(view.OUR_INT, model.makePyramid());

    }
}
