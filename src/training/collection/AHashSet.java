package training.collection;

import java.util.HashSet;

public class AHashSet {
    public static void main(String[] args) {
        HashSet hashSet= new HashSet();

        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("null");
        System.out.println(hashSet);
        System.out.println(hashSet.add("P"));
        System.out.println(hashSet);
    }
}
