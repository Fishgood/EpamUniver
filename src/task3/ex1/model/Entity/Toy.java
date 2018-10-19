package task3.ex1.model.Entity;

public abstract class Toy {
    private String name;
    private String colour;
    private String producer;
    private String size;
    private int price;
    private int year;

    public Toy(String name, String colour, String producer, String size, int price, int year) {
        this.name = name;
        this.colour = colour;
        this.producer = producer;
        this.size = size;
        this.price = price;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public String getProducer() {
        return producer;
    }

    public String getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", producer='" + producer + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price + " $" +
                ", year=" + year +
                '}';
    }
}
