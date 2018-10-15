package com.company.task1.ex5;

class RotateMatrixController {
    private RotateMatrixModel model;
    private RotateMatrixView view;

    RotateMatrixController(RotateMatrixModel model, RotateMatrixView view) {
        this.model = model;
        this.view = view;
    }

    void calculate() {
        view.printMessageAndResult(view.INIT_ARR,
                model.makeInitialMatrix(InputUtility.inputIntValueWithScanner(view)));
        model.rotateMatrix();
        view.printMessageAndResult(view.OUR_INT, model.getMatrix());
    }
}
