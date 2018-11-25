package task1.ex5;

public class Main {

    public static void main(String[] args) {
        // write your code here

        RotateMatrixView view = new RotateMatrixView();
        RotateMatrixModel model = new RotateMatrixModel();
        RotateMatrixController controller = new RotateMatrixController(model, view);

        controller.calculate();

    }
}
