package task3.ex1.model.Entity;

public class VehicleToy extends Toy {
    private int numOfVehicle;
    private int vehicleSize;
    private boolean toRideByChild;

    public VehicleToy(String name, String colour, String producer, String size, int price, int year,
                      int numOfVehicle, int vehicleSize, boolean toRideByChild) {
        super(name, colour, producer, size, price, year);
        this.numOfVehicle = numOfVehicle;
        this.vehicleSize = vehicleSize;
        this.toRideByChild = toRideByChild;
    }

    public int getNumOfVehicle() {
        return numOfVehicle;
    }

    public boolean isToRideByChild() {
        return toRideByChild;
    }

    @Override
    public String toString() {
        return super.toString() + "Type = VehicleToy{" +
                "numOfVehicle=" + numOfVehicle +
                ", vehicleSize=" + vehicleSize +
                ", toRideByChild=" + toRideByChild +
                '}';
    }
}
