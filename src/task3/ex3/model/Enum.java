package task3.ex3.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Enum<T> implements Comparable {
    private final String name;
    private final T[] arguments;
    private final int ordinal;
    public static int elementsNum = -1;
    private static ArrayList<Enum> enums = new ArrayList<>();

    public Enum() {
        this.name = null;
        this.arguments = null;
        this.ordinal = -1;
    }

    public Enum(String name, T... arguments) {
        this.name = name;
        this.arguments = arguments;
        this.ordinal = ++elementsNum;
        enums.add(this);
    }

    public String getName() {
        return name;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public static Enum valueOf(String enumName) {
        for (Enum tempEnum : enums) {
            if (tempEnum.getName().equals(enumName)) {
                return tempEnum;
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enum<?> anEnum = (Enum<?>) o;

        return Objects.equals(name, anEnum.name) &&
                Arrays.equals(arguments, anEnum.arguments);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(arguments);
        return result;
    }

    @Override
    public int compareTo(Object o) {
        return this.ordinal - ((Enum)o).ordinal;
    }

    @Override
    public String toString() {
        return "Enum{" +
                "name='" + name + '\'' +
                ", arguments=" + Arrays.toString(arguments) +
                ", ordinal=" + ordinal +
                '}';
    }
}
