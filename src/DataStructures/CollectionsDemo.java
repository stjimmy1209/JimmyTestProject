package DataStructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

    public static void main(String[] args) {


        List<Integer> intCollections = new ArrayList();

        intCollections.add(222);
        intCollections.add(323);
        intCollections.add(121);
        intCollections.add(565);
        intCollections.add(432);
        intCollections.add(153);
        intCollections.add(765);

        intCollections.forEach(value-> System.out.println(value + ","));
        System.out.println("\n");


        List<Integer> intCollections2 = new ArrayList();

        intCollections2.add(2);
        intCollections2.add(3);
        intCollections2.add(323);
        intCollections2.add(6);
        intCollections2.add(5);
        intCollections2.add(8);
        intCollections2.add(4);

        intCollections2.forEach(value-> System.out.println(value + ","));

        System.out.println("\n");

        System.out.println(Collections.disjoint(intCollections, intCollections2));




    }
}
