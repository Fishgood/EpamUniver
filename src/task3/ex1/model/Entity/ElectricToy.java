package task3.ex1.model.Entity;

public class ElectricToy extends Toy{
    private boolean isWireless;
    private boolean forVideoGames;
    private int voltage;
    private int capacityOfBattary;
    private double displaySize;

    public ElectricToy(String name, String colour, String producer, String size, int price, int year,
                       boolean isWireless, boolean forVideoGames, int voltage, int capacityOfBattary, double displaySize) {
        super(name, colour, producer, size, price, year);
        this.isWireless = isWireless;
        this.forVideoGames = forVideoGames;
        this.voltage = voltage;

        this.capacityOfBattary = isWireless ? capacityOfBattary : 0;
        this.displaySize = forVideoGames ? displaySize : 0.0;
    }

    @Override
    public String toString() {
        return super.toString() + "Type = ElectricToy{" +
                "isWireless=" + isWireless +
                ", forVideoGames=" + forVideoGames +
                ", voltage=" + voltage +
                ", capacityOfBattery=" + capacityOfBattary +
                ", displaySize=" + displaySize +
                '}';
    }
}
