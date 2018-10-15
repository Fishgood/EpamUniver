package com.company.day2.ex2;

class PerfectNumController {
    private PerfectNumModel model;
    private PerfectNumView view;

    PerfectNumController(PerfectNumModel model, PerfectNumView view) {
        this.model = model;
        this.view = view;
    }

    void calculate() {
        model.setValue(InputUtility.inputIntValueWithScanner(view));
        view.printMessageAndResult(view.OUR_INT, model.calculatePerfNum());

    }
}
