package training.collection;

import java.io.Serializable;
import java.util.*;

public class AList {

    public static void main(String[] args) {

      /*  Collection<Object> linkedList= new LinkedList<>();
        LinkedList<Object> linkedList1 = new LinkedList<>();

        linkedList.add(5);
        linkedList1.add(1);
        linkedList.add(3);
        linkedList1.add(2);
        System.out.println(linkedList);
        System.out.println(linkedList1);*/

      ArrayList list =  new ArrayList();
      LinkedList linkedList = new LinkedList();

      /*list.add("A");
      list.add(10);
      list.add("A");
      list.add(null);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.add(2,"M");
        list.add("N");
        System.out.println(list);*/

        /*System.out.println(list instanceof Serializable);
        System.out.println(list instanceof Cloneable);
        System.out.println(list instanceof RandomAccess);

        System.out.println(linkedList instanceof Serializable);
        System.out.println(linkedList instanceof Cloneable);
        System.out.println(linkedList instanceof RandomAccess);*/

        List list1 = Collections.synchronizedList(list);


    }
}
