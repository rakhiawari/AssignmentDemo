package training.collection;

import java.util.ArrayList;

public class CollectionInsert {

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            array.add(i);
        }

        array.forEach(a -> System.out.println(a));
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println(array.get(i));
        }*/


    }
}
