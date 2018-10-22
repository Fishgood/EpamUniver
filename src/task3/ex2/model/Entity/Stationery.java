package task3.ex2.model.Entity;

public class Stationery extends Item {

    public Stationery(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Stationery{" +
                super.toString() +
                "}";
    }
}
