package dev.koodeu;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Cat> {
    @Override
    public int compare(Cat cat, Cat t1) {
        return cat.getAge() - t1.getAge();
    }
}
