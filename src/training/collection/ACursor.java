package training.collection;

import java.util.*;

public class ACursor {

    public static void main(String[] args) {
       /* Vector vector = new Vector();
        for (int i = 1; i <= 10; i++) {
            vector.addElement(i);
        }*/
        /*System.out.println(vector);*/
        //ENUMERATION!!!

        /*Enumeration enumeration= vector.elements();
        while (enumeration.hasMoreElements()) {
            Integer I = (Integer)enumeration.nextElement();
            if(I%2==0) {
                System.out.println(I);
            }
        }*/

        //ITERATOR

        ArrayList<Integer> arrayList = new ArrayList<>();
        ListIterator iterator = arrayList.listIterator();
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

    }
}
