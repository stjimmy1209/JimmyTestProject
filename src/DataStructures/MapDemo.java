package DataStructures;

//three Maps

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        MapTest();
    }

    public static void MapTest(){

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Kobe Bryant", 38);
        hashMap.put("Chris Paul", 33);
        hashMap.put("Michael Jordan", 55);
        hashMap.put("Allen Iverson", 37);
        hashMap.put("Stephen Curry", 30);

        System.out.println(hashMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Kobe Bryant", 38);
        linkedHashMap.put("Chris Paul", 33);
        linkedHashMap.put("Michael Jordan", 55);
        linkedHashMap.put("Allen Iverson", 37);
        linkedHashMap.put("Stephen Curry", 30);

        System.out.println(linkedHashMap);

        Map<String, Integer> treeMap = new TreeMap<>(new MyTreeComparator());
        treeMap.putAll(linkedHashMap);
        System.out.println(treeMap);

    }


}

class MyTreeComparator implements Comparator<String>{


    @Override
    public int compare(String key1, String key2) {

        if(key1.compareTo(key2) > 0) return -1;
            if(key1.compareTo(key2)< 0) return 1;
            return 0;
    }
}
