package com.company.day2.ex1;

import java.util.Stack;

class BinaryModel {

    private int value;

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }

    void calculateBinary(int option) {

        if (option == 1) {
            String res = "";
            int temp = value;

            do {
                if (temp % 2 == 0) {
                    res += 0;
                    temp >>= 1;
                } else {
                    res += 1;
                    temp >>= 1;
                }
            }while (temp != 0);

            value = Integer.parseInt(new StringBuffer(res).reverse().toString());

        } else if (option == 2) {
            //long startTime2 = System.currentTimeMillis();
            Stack<Integer> resStack = new Stack<>();
            String res = "";
            int temp = value;
            do {
                if (temp % 2 == 0) {
                    resStack.push(0);
                    temp >>= 1;
                } else {
                    resStack.push(1);
                    temp >>= 1;
                }
            } while (temp != 0);

            while (!resStack.empty()) {
                res += resStack.pop();
            }
            value = Integer.parseInt(res);
            //long endTime2 = System.currentTimeMillis();

            //System.out.println("\n2That took " + (endTime2 - startTime2) + " milliseconds");
        }


    }

}
