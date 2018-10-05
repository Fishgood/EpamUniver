package com.company.day2.ex2;

import java.util.ArrayList;
import java.util.Stack;

class PerfectNumModel {

    private int value;

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }

    void calculatePerfNum(int option) {

        if (option == 1) {
            int[] arr = new int[15];

            int numCheck,
                    arrCount = 0;

            for (int i = 1; i <= value; i++) {
                numCheck = 0;
                for (int j = 1; j <= i / 2; j++) {
                    if (i % j == 0) numCheck += j;
                }
                if (numCheck == i) arr[arrCount++] = i;
            }

            for (int i = 0; i <= arrCount - 1; i++) {
                System.out.print(arr[i] + " ");
            }

        } else if (option == 2){
            ArrayList<Integer> arr = new ArrayList<>(8);
            int count = 0;

            for (int i = 1; i <= value; i++) {
                count = 0;
                for (int j = 1; j <= i / 2; j++) {
                    if (i % j == 0) count += j;
                }
                if (count == i) arr.add(i);
            }

            System.out.print(arr.toString());
        }


    }

}
