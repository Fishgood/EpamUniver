package task1.ex2;

class PerfectNumModel {

    private int value;

    void setValue(int value) {
        this.value = value;
    }

    int[] calculatePerfNum() {

        int[] arr = new int[15];

        int numCheck = 0;

        for (int i = 1, indexCount = 0; i <= value; i++) {
            numCheck = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) numCheck += j;
            }
            if (numCheck == i) arr[indexCount++] = i;
        }
        return arr;
    }

}
