package com.ceenuts;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class WorkingWithLinkedLists {

    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<>();

        people.add(new Person("Alex", 21));
        people.add(new Person("Alexa", 21));
        people.addFirst(new Person("Ali", 18));

        ListIterator<Person> personListIterator = people.listIterator();

        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }

        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }

    record Person(String name, int aga){}
}
