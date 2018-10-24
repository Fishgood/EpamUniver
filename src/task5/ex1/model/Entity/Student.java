package task5.ex1.model.Entity;

public class Student {
    private String surname;
    private String name;
    private String nirthdate;
    private String phone;
    private String address;

    public Student(String surname, String name, String nirthdate, String phone, String address) {
        this.surname = surname;
        this.name = name;
        this.nirthdate = nirthdate;
        this.phone = phone;
        this.address = address;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNirthdate() {
        return nirthdate;
    }

    public void setNirthdate(String nirthdate) {
        this.nirthdate = nirthdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", nirthdate='" + nirthdate + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
