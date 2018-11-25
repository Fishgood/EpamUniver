package task1.ex5;

class RotateMatrixView {
    final String INPUT_INT_DATA =
            "Enter size of matrix = ";
    final String INIT_ARR =
            "Initial matrix: ";
    final String WRONG_INPUT_INT_DATA =
            "Wrong input! Repeat please! ";
    final String OUR_INT = "Result matrix = \n";

    void printMessage(String message) {
        System.out.print(message);
    }

    void printMessageAndResult(String message, int[][] matrix) {
        System.out.println(message);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
