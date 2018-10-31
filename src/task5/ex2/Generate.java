package task5.ex2;

import java.awt.dnd.InvalidDnDOperationException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Generate {
    private List list;
    private Set set;

    Generate(int quantity, int rangeLeft, int rangeRight) {
        if ((rangeRight - rangeLeft) < 0 || (rangeRight - rangeLeft) > quantity) {
            throw new InvalidDnDOperationException();
        }
        Random r = new Random();
        this.list = generateList(r, quantity, rangeLeft, rangeRight);
        this.set = generateSet(r, quantity, rangeLeft, rangeRight);
    }

    List getList() {
        return list;
    }

    Set getSet() {
        return set;
    }

    private List generateList(Random r, int quantity, int rangeLeft, int rangeRight) {

        return r.ints(rangeLeft, rangeRight)
                .boxed()
                .distinct()
                .limit(quantity)
                .collect(Collectors.toList());

        /*return Stream.generate(() -> rangeLeft + r.nextInt((rangeRight - rangeLeft) + 1))
                .limit(quantity)
                .collect(Collectors.toList());*/
    }

    private Set generateSet(Random r, int quantity, int rangeLeft, int rangeRight) {
        return r.ints(rangeLeft, rangeRight)
                .boxed()
                .distinct()
                .limit(quantity)
                .collect(Collectors.toSet());

        /*if (quantity < rangeLeft + (rangeRight - rangeLeft + 1)) return null;
        return Stream.generate(() -> rangeLeft + r.nextInt(rangeRight - rangeLeft + 1))
                .distinct()
                .limit(quantity)
                .collect(Collectors.toSet());*/
    }
}
