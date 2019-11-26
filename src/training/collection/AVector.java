package training.collection;

import java.util.Vector;

public class AVector {

    public static void main(String[] args) {
        Vector vector = new Vector(10,3);
        System.out.println(vector.size());
        for (int i=1;i<=10;i++) {
            vector.addElement(i);
        }
        System.out.println(vector.capacity());
        vector.addElement("A");
        System.out.println(vector.capacity());
        System.out.println(vector);
    }
}
