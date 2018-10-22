package task3.ex2.model.Entity;

public class Electronics extends Item{
    private String type;
    private int power;

    public Electronics(String name, double price, String type, int power) {
        super(name, price);
        this.type = type;
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                super.toString() +
                "type='" + type + '\'' +
                ", power=" + power +
                '}';
    }
}
