package task3.ex1.model.Entity;

public class Doll extends Toy{
    private String gender;
    private String haircut;
    private String material;

    public Doll(String name, String colour, String producer, String weight, int price, int year, String gender,
                String haircut, String material) {
        super(name, colour, producer, weight, price, year);
        this.gender = gender;
        this.haircut = haircut;
        this.material = material;
    }

    public String getGender() {
        return gender;
    }

    public String getMaterial() {
        return material;
    }

    public String getHaircut() {
        return haircut;
    }

    public void setHaircut(String haircut) {
        this.haircut = haircut;
    }

    @Override
    public String toString() {
        return super.toString() + "Type = Doll{" +
                "gender='" + gender + '\'' +
                ", material='" + material + '\'' +
                ", haircut='" + haircut + '\'' +
                '}';
    }
}
