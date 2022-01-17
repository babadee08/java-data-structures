package com.ceenuts;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashFunctions {

    public static void main(String[] args) {
        Map<Person, Diamond> map = new HashMap<>();

        map.put(new Person("Jemila"), new Diamond("African Diamond"));

        System.out.println(new Person("Jamila").hashCode());
        System.out.println(new Person("Jemila").hashCode());
        System.out.println(map.get(new Person("Jemila")));
    }

    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Person person = (Person) o;

            return name != null ? name.equals(person.name) : person.name == null;
        }

        @Override
        public int hashCode() {
            return name != null ? name.hashCode() : 0;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
    record Diamond(String name){}
}
