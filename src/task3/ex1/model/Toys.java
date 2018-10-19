package task3.ex1.model;

import task3.ex1.model.Entity.Toy;

import java.util.Arrays;
import java.util.Comparator;

public class Toys {
    private Toy[] toys;

    public Toy[] getToys() {
        return toys;
    }

    public void setToys(Toy[] toys) {
        this.toys = toys;
    }

    public Object[] sortByPrice() {
        return Arrays.stream(toys)
                .sorted(Comparator.comparing(Toy::getPrice))
                .toArray();
    }

    public int getTotalPrice() {
        return Arrays.stream(toys)
                .map(Toy::getPrice)
                .reduce(0,Integer::sum);
    }

    public Object[] getToysBetweenYears(int year1, int year2){
        return Arrays.stream(toys)
                .filter(toy -> toy.getYear() > year1 && toy.getYear() < year2)
                .toArray();
    }


}
