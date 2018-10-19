package task3.ex1.model;

import task3.ex1.model.Entity.Doll;
import task3.ex1.model.Entity.ElectricToy;
import task3.ex1.model.Entity.Toy;
import task3.ex1.model.Entity.VehicleToy;

public class Data {

    public static Toy[] getToys(){
        return new Toy[]{
                new Doll("Brandon", "white", "Busher Inc.", "Small", 15, 2017,
                        "male", "short", "Wood"),
                new ElectricToy("PSP", "Black", "Sony Inc.", "Small", 100, 2013,
                        true, true, 240, 2200, 4.3),
                new VehicleToy("Skate", "Black", "Pok Inc.", "Less then avarage", 50,
                        2016, 4, 15, true)
        };
    }

}
