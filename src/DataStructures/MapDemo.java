package DataStructures;

//three Maps


import java.sql.SQLOutput;
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

        Map<String, Integer> treeMap = new TreeMap<>(new MyTreeComparator(linkedHashMap));
        treeMap.putAll(linkedHashMap);
        System.out.println(treeMap);

        System.out.println("1. get value base on keys: ");
        for(String key: treeMap.keySet()){
            System.out.println(key + "--" + treeMap.get(key));
        }

        System.out.println("*************\n");

        System.out.println("2. get value by Map.EntrySet with Iterator: ");

        Set<Map.Entry<String, Integer>> entrySet = treeMap.entrySet();
        Iterator<Map.Entry<String, Integer>> entrySetIter = entrySet.iterator();
        while (entrySetIter.hasNext())
        {
            Map.Entry<String, Integer> entry = entrySetIter.next();
            System.out.println(entry.getKey() + "---" + entry.getValue());

        }

        System.out.println("******************\n");

        System.out.println("3. get value by traversing Map.entrySet");

        for(Map.Entry<String, Integer> entry:treeMap.entrySet()){

            System.out.println(entry.getKey() + "======" + entry.getValue());

        }



    }


}

class MyTreeComparator implements Comparator<String> {

    private Map<String,Integer> map;
    public MyTreeComparator(Map<String, Integer> map){
        this.map = map;
    }

    @Override
    public int compare(String key1, String key2) {

            /*if(key1.compareTo(key2) > 0) return -1;
            if(key1.compareTo(key2)< 0) return 1;*/

            if(map.get(key1).intValue() > map.get(key2).intValue()){
                return 1;}
            if(map.get(key1).intValue() < map.get(key2).intValue()){
                return -1;}
            return 0;
    }
}
