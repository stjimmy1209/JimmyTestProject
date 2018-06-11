package DataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedListDemo {

    public static void main(String[] args) {

        System.out.println("Arraylist costs time: " + CostTime(new ArrayList<>()));
        System.out.println("Arraylist costs time: " + CostTime(new LinkedList<>()));
    }

    public static long CostTime(List<Object> list){

        Object obj = new Object();
        final int n = 100000;
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            list.add(0,obj);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;

    }

}
