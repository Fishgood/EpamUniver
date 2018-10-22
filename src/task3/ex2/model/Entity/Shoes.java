package task3.ex2.model.Entity;

public class Shoes  extends Item{
    private int size;

    public Shoes(String name, double price, int size) {
        super(name, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                super.toString() +
                "size=" + size +
                '}';
    }
}
