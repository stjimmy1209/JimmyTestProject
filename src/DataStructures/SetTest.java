package DataStructures;

import java.util.*;

public class SetTest {

    public static void main(String[] args) {
        HashSetDemo();
        LinkedHashSetDemo();
        TreeSetDemo();

    }

    public static void HashSetDemo(){

        Set<String> citySet = new HashSet<>();
        citySet.add("New York");
        citySet.add("Paris");
        citySet.add("London");
        citySet.add("Tokyo");
        citySet.add("Beijing");

        citySet.forEach(str-> System.out.println(str+ ","));
        System.out.println("\n");

    }

    public static void LinkedHashSetDemo(){

        Set<String> citySet = new LinkedHashSet<>();
        citySet.add("New York");
        citySet.add("Paris");
        citySet.add("London");
        citySet.add("Tokyo");
        citySet.add("Beijing");

        citySet.forEach(str-> System.out.println(str+ ","));
        System.out.println("\n");

    }

    public static void TreeSetDemo(){

        TreeSet<String> citySet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if(o1.compareTo(o2)>0){

                    return 10;
                }
                if(o1.compareTo(o2)<0){
                    return -10;
                }

                return 0;
            }
        });
        citySet.add("New York");
        citySet.add("Paris");
        citySet.add("London");
        citySet.add("Tokyo");
        citySet.add("Beijing");

        citySet.forEach(str-> System.out.println(str+ ","));


    }

}
