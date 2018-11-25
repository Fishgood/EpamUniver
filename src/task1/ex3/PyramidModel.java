package task1.ex3;

class PyramidModel {

    private int value;

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }

    String makePyramid() {
            int count = 1;
            String res = "\n";

            for (int i = value; i > 0; i--) {

                for (int j = 0; j < i * 2; j++)
                    res += " ";

                for (int j = 1; j <= count; j++)
                    res += j + " ";

                for (int j = count - 1; j > 0; j--)
                    res += j + " ";

                count++;
                res += "\n";
            }

            return res;

    }

}
