package collections;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        //HashSet code
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        System.out.println(set);
        //hashMap Code
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("apple", 10);
        myMap.put("banana", 20);
        myMap.put("orange", 30);
        System.out.println(myMap);
        //List Code
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");
        System.out.println( myList);
        //Linkedlist code
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("apple");
        myLinkedList.add("banana");
        myLinkedList.add("orange");
        System.out.println(myLinkedList);
    }
}

