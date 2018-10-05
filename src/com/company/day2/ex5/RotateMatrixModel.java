package com.company.day2.ex5;

class RotateMatrixModel {

    private int value;

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }

    int[][] makeInitialMatrix(){
        int[][] initialMatrix = new int[value][value];
        for (int i = 0; i < initialMatrix.length; i++) {
            for (int j = 0; j < initialMatrix[i].length; j++) {
                initialMatrix[i][j] = (-100) + (int) (Math.random() * 100);
            }
        }
        return initialMatrix;
    }

    int[][] rotateMatrix(int[][] rotMat) {
            int temp;
            for(int i=0;i<value/2;i++)
            {
                for(int j=i;j<value-1-i;j++)
                {
                    temp = rotMat[i][j];
                    rotMat[i][j] = rotMat[value-j-1][i];
                    rotMat[value-j-1][i] = rotMat[value-i-1][value-j-1];
                    rotMat[value-i-1][value-j-1] = rotMat[j][value-i-1];
                    rotMat[j][value-i-1] = temp;
                }
            }

            return rotMat;
    }

    String resultMatrixs(){
        String res = "Initial matrix size of [" + value + "][" + value + "] : \n";

        int[][] initMatrix = makeInitialMatrix();
        int[][] resMatrix = rotateMatrix(initMatrix);

        for (int i = 0; i < initMatrix.length; i++) {
            for (int j = 0; j < initMatrix[i].length; j++) {
                res += initMatrix[i][j] + "\t";
            }
            res += "\n";
        }
        res += "\nRotated matrix : \n";

        for (int i = 0; i < resMatrix.length; i++) {
            for (int j = 0; j < resMatrix[i].length; j++) {
                res += resMatrix[i][j] + "\t";
            }
            res += "\n";
        }


        return res;
    }

}
