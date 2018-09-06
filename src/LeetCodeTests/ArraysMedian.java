package LeetCodeTests;

import Test1.ArraySort;

import java.util.*;

public class ArraysMedian {

    public static void main(String[] args) {

        int [] arr1 = {3,4,5,6,7,8}, arr2 = {2,3,4,2,4,2};

        //define a list to receive the first array;
        List<Integer> list1 = new LinkedList<>();

        for (int i = 0; i < arr1.length; i++) {
            list1.add(0);
        }

        for (int i = 0; i < arr1.length; i++) {
            list1.set(i,arr1[i]);
        }

        System.out.println("array1: " + list1);
        //define a list to receive the second array;

        List<Integer> list2 = new LinkedList<>();

        for (int i = 0; i < arr2.length; i++) {
            list2.add(0);
        }

        for (int i = 0; i < arr2.length; i++) {
            list2.set(i,arr2[i]);
        }
        System.out.println("array2: " +list2);

        list2.addAll(list1);// merge the arrays
        System.out.println("array1 + array2: " + list2);

            Collections.sort(list2);
        System.out.println("the sorted array is: "+list2);
        System.out.println(list2.size()/2);
        System.out.println(list2.size()/2+1);

        double med;
        if(list2.size()%2 == 0){

            med = ((double)list2.get(list2.size()/2-1)+(double)list2.get(list2.size()/2))/2;

        }else{
            med = list2.get(list2.size()/2);
        }

        System.out.println("the median is: "+med);





    }

}
