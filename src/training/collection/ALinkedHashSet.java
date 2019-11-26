package training.collection;

import java.util.LinkedHashSet;

public class ALinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();

        linkedHashSet.add(1);
        linkedHashSet.add(2);
        System.out.println(linkedHashSet.add(1));
        System.out.println(linkedHashSet);
    }
}
