package com.company.task1.ex1;

class Model {

    private String value;
    private int option;
    final int numOfOptions = 3;

    void setOption(int option) {
        this.option = option;
    }

    String getValue() {
        return value;
    }

    void setValue(String value) {
        this.value = value;
    }

    private void calculateBinary() {
        String res = "";
        int temp = Integer.parseInt(value);

        do {
            res += temp % 2;
            temp >>= 1;

        } while (temp != 0);

        value = new StringBuffer(res).reverse().toString();
    }

    private void calculateOctal() {
        String res = "";
        int temp = Integer.parseInt(value);

        do {
            res += temp % 8;
            temp >>= 3;

        } while (temp != 0);

        value = new StringBuffer(res).reverse().toString();
    }

    private void calculateHexadecimal() {
        //just do it tomorrow
        String res = "";
        int temp = Integer.parseInt(value);

        do {
            if (temp % 16 > 9){
                res += (char)((temp % 16) + 55);
                temp >>= 4;
            } else {
                res += temp % 16;
                temp >>= 4;
            }
        }while (temp != 0);

        value = new StringBuffer(res).reverse().toString();
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
                calculateHexadecimal();
                break;
            default:
                System.out.println("No such option");
        }
    }

}
