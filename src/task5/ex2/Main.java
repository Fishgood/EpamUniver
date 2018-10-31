package task5.ex2;

public class Main {

    public static void main(String... args){
        Generate generate = new Generate(82, 20, 100);

        System.out.println("List: " + generate.getList() + " size " + generate.getList().size());
        System.out.println("Set: " + generate.getSet() + " size " + generate.getSet().size());

    }
}
