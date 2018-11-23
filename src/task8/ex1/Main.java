package task8.ex1;

public class Main {

    public static void main(String... args) {
        Runnable countdown = () -> {
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Bomb");
        };
        countdown.run();
    }

}