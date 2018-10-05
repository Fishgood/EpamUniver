package com.company.day2.ex5;

class RotateMatrixController {
    private RotateMatrixModel model;
    private RotateMatrixView view;

    RotateMatrixController(RotateMatrixModel model, RotateMatrixView view) {
        this.model = model;
        this.view = view;
    }

    void calculate() {
        model.setValue(InputUtility.inputIntValueWithScanner(view));
        view.printMessageAndResult(view.OUR_INT, model.resultMatrixs());

    }
}
