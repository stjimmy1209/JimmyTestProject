package DataStructures;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            list1.add(i);
        }

        System.out.println(list1);
        System.out.println(list1.size());
        list1.add(4, 666);
        System.out.println(list1);
        list1.set(7, 999);
        System.out.println(list1);

        list2.add("Bryant");
        list2.add("McGrady");
        list2.add("Irvine");
        list2.add("Duncan");
        list2.add("Iverson");
        list2.add("Harden");
        list2.add("O'Neal");

        System.out.println(list2);

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }

        for (Integer list:list1
             ) {

            System.out.println(list);
            
        }

        Iterator<String> ita = list2.iterator();
        while(ita.hasNext()){
            System.out.println(ita.next());
        }

        ListIterator<String> listIter = list2.listIterator();
        while(listIter.hasNext())
        {
            System.out.print(listIter.next() + ",");
        }

        //ListIterator is different:
        //1.It could read data in both directions
        //2.ListIterator is able to edit elements

        System.out.print("\ntraverse elements backward: ");

        ListIterator <String> listIter2 = list2.listIterator(list2.size());
        while(listIter2.hasPrevious()){

            System.out.print(listIter2.previous() +",");
        }

        System.out.println("\n");

        ListIterator <String> listIter3 = list2.listIterator(2);
        if(listIter3.hasPrevious())
        {
            listIter3.previous();
            listIter3.set("Nowitzki");
        }

        System.out.print(list2 + ",");

        System.out.println("\nOne element has been removed.");
        System.out.println("\nThe element that has been removed is: " + list2.get(5));
        list2.remove(3);
        System.out.println(list2);

        list2.remove("Bryant");
        System.out.println(list2);
        System.out.println("Sublist: (2,5): " + (list2.subList(2,5)));



    }

}
