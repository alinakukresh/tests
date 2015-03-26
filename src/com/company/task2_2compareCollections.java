package com.company;

import java.util.*;

/**Проверить скорость работы (добавление, поиск элемента, удаление) следующих коллекций:
*   a.   Lists (ArrayList vs LinkedList);
 *  b.	Sets (HashSet vs TreeSet);
 *  c.	Maps (HashMap vs TreeMap).
 */


public class task2_2compareCollections {

    private static final int ELEMENTS_CNT = 1000000;
    private static final Random random = new Random();

    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        fill(arrList);
        fill(linkedList);
        fill(hashSet);
        fill(treeSet);
        fillMap(hashMap);
        fillMap(treeMap);

        Integer L = new Integer(567);

        // ADD

        long start = System.nanoTime();
        arrList.add(L);
        System.out.println("ArrayList add time: " + (System.nanoTime() - start) + "ns");

        start = System.nanoTime();
        linkedList.add(L);
        System.out.println("LinkedList add time: " + (System.nanoTime() - start) + "ns");

        start = System.nanoTime();
        hashSet.add(L);
        System.out.println("HashSet add time: " + (System.nanoTime() - start) + "ns");

        start = System.nanoTime();
        treeSet.add(L);
        System.out.println("TreeSet add time: " + (System.nanoTime() - start) + "ns");

        start = System.nanoTime();
        hashMap.put(L, "value");
        System.out.println("HashMap add time: " + (System.nanoTime() - start) + "ns");

        start = System.nanoTime();
        treeMap.put(L, "value");
        System.out.println("TreeMap add time: " + (System.nanoTime() - start) + "ns");


        //SEARCH
        System.out.println();
        start = System.nanoTime();
        arrList.contains(L);
        System.out.println("ArrayList search time: " + (System.nanoTime() - start) + "ns");

        start = System.nanoTime();
        linkedList.contains(L);
        System.out.println("LinkedList search time: " + (System.nanoTime() - start) + "ns");

        start = System.nanoTime();
        hashSet.contains(L);
        System.out.println("HashSet search time: " + (System.nanoTime() - start) + "ns");

        start = System.nanoTime();
        treeSet.contains(L);
        System.out.println("TreeSet search time: " + (System.nanoTime() - start) + "ns");

        start = System.nanoTime();
        hashMap.get(L);
        System.out.println("HashMap search time: " + (System.nanoTime() - start) + "ns");

        start = System.nanoTime();
        treeMap.get(L);
        System.out.println("TreeMap search time: " + (System.nanoTime() - start) + "ns");

        //REMOVE
        System.out.println();
        start = System.nanoTime();
        arrList.remove(L);
        System.out.println("ArrayList remove time: " + (System.nanoTime() - start) + "ns");

        start = System.nanoTime();
        linkedList.remove(L);
        System.out.println("LinkedList remove time: " + (System.nanoTime() - start) + "ns");

        start = System.nanoTime();
        hashSet.remove(L);
        System.out.println("HashSet remove time: " + (System.nanoTime() - start) + "ns");

        start = System.nanoTime();
        treeSet.remove(L);
        System.out.println("TreeSet remove time: " + (System.nanoTime() - start) + "ns");

        start = System.nanoTime();
        hashMap.remove(L);
        System.out.println("HashMap remove time: " + (System.nanoTime() - start) + "ns");

        start = System.nanoTime();
        treeMap.remove(L);
        System.out.println("TreeMap remove time: " + (System.nanoTime() - start) + "ns");



    }

    private static void fill(Collection<Integer> collection) {
        for (int i = 0; i < ELEMENTS_CNT; i++) {
            collection.add(random.nextInt());
        }
    }

    private static void fillMap(Map<Integer, String> map) {
        for (int i = 0; i < ELEMENTS_CNT; i++) {
            map.put(random.nextInt(),"value");
        }
    }
}
