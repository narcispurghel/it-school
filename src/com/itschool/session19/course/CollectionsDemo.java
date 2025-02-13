package com.itschool.session19.course;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        listDemo();

        Map<Long, String> cnpMap = new HashMap<>();
        cnpMap.put(123L, "narcis");
        cnpMap.put(1234L, "teodor");
        System.out.println(cnpMap);

        Queue<String> queue = new PriorityQueue<>();
        queue.add("narcis");
        queue.add("teodor");
        System.out.println(queue);
    }

    public static void listDemo() {
        List<String> list = new LinkedList<>();
        list.add("narcis");
        list.add("gabriel");
        list.add("teodor");
        list.add("marius");
        list.add("narcis");

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Iterator<String> stringIterator = list.iterator();
        while (stringIterator.hasNext()) {
            if (stringIterator.next().equals("narcis")) {
                list.remove(stringIterator.next());
            }
        }

        System.out.println(list);
    }
}
