package task8.ex2;

import java.util.stream.IntStream;


public class Threads implements Runnable {

    private static Integer million = 0;
    private static boolean flag = false;

    @Override
    public void run() {

        new Thread(() -> {
            synchronized (this) {
                IntStream.range(0, 1000000)
                        .forEach(i -> {
                            while (flag) {
                                try {
                                    wait();
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            million++;
                            flag = true;
                            notify();
                        });
            }
        }).start();

        new Thread(() -> {
            synchronized (this) {
                while (million != 1000000) {
                    while (!flag) {
                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(million);
                    flag = false;
                    notify();

                }
            }
        }).start();

    }
}
