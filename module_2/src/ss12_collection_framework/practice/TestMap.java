package ss12_collection_framework.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        /**
         * Hash Map
         */
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Nam", 18);
        hashMap.put("Ngan", 18);
        System.out.println(hashMap);

        /**
         * Tree Map
         */
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);

        /**
         * Linked HashMap
         */
        Map<String, Integer> linkedHashMap=new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 65);
        linkedHashMap.put("Cook", 29);
        System.out.println(linkedHashMap.get("Lewis"));
    }
}
