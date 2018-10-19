package task2.ex1;

import task2.ex1.controller.Controller;

public class Main {
    public static void main(String[] args){
        /*Controller controller = new Controller();

        controller.run();*/

        new Controller().run();

        /*int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int res = 0;
        String resString = "";
        int a = 0;
        int b = 8;

        do {
            resString = "";
            res = arr[a + (int)(Math.random() * b)] + arr[a + (int)(Math.random() * b)] + arr[a + (int)(Math.random() * b)];
            resString += res;
            System.out.println(resString);
        }while (res != 30);

        System.out.println("end one: " + resString);*/
    }
}
