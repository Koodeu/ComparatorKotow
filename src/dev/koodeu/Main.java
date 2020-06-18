package dev.koodeu;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

    Cat cat1 = new Cat("Lila", 5, 3.50);
    Cat cat2 = new Cat("Lola", 12, 4.50);
    Cat cat3 = new Cat("Lola", 18, 6.50);
    Cat cat4 = new Cat("Lolek", 3, 8.50);

        ArrayList<Cat> listOfCats = new ArrayList<>();
        listOfCats.add(cat1);
        listOfCats.add(cat2);
        listOfCats.add(cat3);
        listOfCats.add(cat4);

        System.out.println("------ SORTED BY NAME AND AGE--------");
        Collections.sort(listOfCats, new ComparatorByName());
        for (Cat cat : listOfCats){
            System.out.println(cat.toString());
        }

        System.out.println("--------- SORTED BY AGE -----------");
        Collections.sort(listOfCats, new ComparatorByAge());
        for (Cat cat : listOfCats){
            System.out.println(cat.toString());
        }

        System.out.println(" ------- SORTED BY WEIGHT REVERSED--------");
        Collections.sort(listOfCats, new ComparatorByWeight());
        for (Cat cat : listOfCats){
            System.out.println(cat.toString());
        }



    }
}
