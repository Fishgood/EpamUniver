package com.company.day2.ex1;

class Model {

    private int value;
    private int option;
    final int numOfOptions = 3;

    void setOption(int option) {
        this.option = option;
    }

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }

    private void calculateBinary() {
        String res = "";
        int temp = value;

        do {
            res += temp % 2;
            temp >>= 1;

        } while (temp != 0);

        value = Integer.parseInt(new StringBuffer(res).reverse().toString());
    }

    private void calculateOctal() {
        String res = "";
        int temp = value;

        do {
            res += temp % 8;
            temp >>= 3;

        } while (temp != 0);

        value = Integer.parseInt(new StringBuffer(res).reverse().toString());
    }

    private void calculateHexadecimal(){
        //just do it tomorrow
    }

    void calculate() {
        switch (option) {
            case 1:
                calculateBinary();
                break;
            case 2:
                calculateOctal();
                break;
            case 3:

                break;
        }
    }

}
