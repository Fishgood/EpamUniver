package com.company.day2.ex1;

class BinaryController {
    private BinaryModel model;
    private BinaryView view;

    BinaryController(BinaryModel model, BinaryView view) {
        this.model = model;
        this.view = view;
    }

    void calculate() {
        model.setValue(InputUtility.inputIntValueWithScanner(view));
        model.calculateBinary(1);
        view.printMessageAndResult(view.OUR_INT, model.getValue());

    }
}
