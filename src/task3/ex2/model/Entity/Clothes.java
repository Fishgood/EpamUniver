package task3.ex2.model.Entity;

public class Clothes extends Item {
    private int size;
    private String colour;

    public Clothes(String name, double price, int size, String colour) {
        super(name, price);
        this.size = size;
        this.colour = colour;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                super.toString() +
                "size=" + size +
                ", colour='" + colour + '\'' +
                '}';
    }
}
