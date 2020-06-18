package dev.koodeu;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Cat> {

    @Override
    public int compare(Cat cat, Cat t1) {
        int result = cat.getName().compareTo(t1.getName());
        if (result == 0){
            int rezultat = cat.getAge() - t1.getAge();
            return rezultat;
        }
        return result;
    }
}
