package Collection;

import java.util.*;

public class Collection {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        //LinkedList
        List<String> linkedList = new ArrayList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add(1,"C");
        System.out.println(linkedList);

        //HashSet
        Set<String> hashset = new HashSet<>(); // 중복되는 데이터 x
        hashset.add("A");
        hashset.add("B");
        hashset.add("A");
        System.out.println(hashset);

        //LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>(); // 넣은 순서대로 !
        linkedHashSet.add("C");
        linkedHashSet.add("B");
        linkedHashSet.add("A");
        System.out.println(linkedHashSet);

        //TreeSet
        Set<String> treeSet = new TreeSet<>(); // 자동정렬 !
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("A");
        System.out.println(treeSet);

        //HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        System.out.println(hashMap);
        System.out.println(hashMap.get("one"));

        //LinkedHashMap
        Map<String, Integer> link = new LinkedHashMap<>();
        link.put("two", 2);
        link.put("three", 3);
        link.put("one", 1);
        System.out.println(link);

        //TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("C", 3);
        treeMap.put("A", 1);
        treeMap.put("B", 2);
        System.out.println(treeMap);
    }
}
