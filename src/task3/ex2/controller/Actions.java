package task3.ex2.controller;

import task3.ex2.Utility.InputItem;
import task3.ex2.model.Entity.*;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Actions {

    public static void initItem(ArrayList<Item> items, int type, Object fields) {

        ArrayList<String> params = InputItem.inputParameter(fields);

        switch (type) {
            case 1:
                items.add(new Clothes(params.get(0), Double.parseDouble(params.get(1)),
                        Integer.parseInt(params.get(2)), params.get(3)));
                break;
            case 2:
                items.add(new Electronics(params.get(0), Double.parseDouble(params.get(1)),
                        params.get(2), Integer.parseInt(params.get(3))));
                break;
            case 3:
                items.add(new Shoes(params.get(0), Double.parseDouble(params.get(1)),
                        Integer.parseInt(params.get(2))));
                break;
            case 4:
                items.add(new Stationery(params.get(0), Double.parseDouble(params.get(1))));
                break;
        }
    }
}
