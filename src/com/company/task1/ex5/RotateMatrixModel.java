package com.company.task1.ex5;

class RotateMatrixModel {

    private int[][] matrix;

    int[][] getMatrix() {
        return matrix;
    }

    int[][] makeInitialMatrix(int size){
        matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (-100) + (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    void rotateMatrix() {
            int temp;
            for(int i=0;i<matrix.length/2;i++)
            {
                for(int j=i;j<matrix.length-1-i;j++)
                {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[matrix.length-j-1][i];
                    matrix[matrix.length-j-1][i] = matrix[matrix.length-i-1][matrix.length-j-1];
                    matrix[matrix.length-i-1][matrix.length-j-1] = matrix[j][matrix.length-i-1];
                    matrix[j][matrix.length-i-1] = temp;
                }
            }
    }

}
