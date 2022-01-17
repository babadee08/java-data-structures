package com.ceenuts;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {

    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();

        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alexa"));
        map.put(3, new Person("Maria"));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map.values());

        map.entrySet().forEach(System.out::println);

        map.remove(3);

        map.forEach((key, value) -> System.out.println(key + " " + value));

        map.forEach((key, person) -> System.out.println(key + " - " + person));

        System.out.println(map.getOrDefault(3, new Person("default")));
        map.entrySet().forEach(System.out::println);
    }

    record Person(String name){}
}
