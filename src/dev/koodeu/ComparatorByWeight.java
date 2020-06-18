package dev.koodeu;

import java.util.Comparator;

public class ComparatorByWeight implements Comparator<Cat> {
    @Override
    public int compare(Cat cat, Cat t1) {
        int result = Double.compare(cat.getWeight(), t1.getWeight());
        return -1 * result;
    }
}
