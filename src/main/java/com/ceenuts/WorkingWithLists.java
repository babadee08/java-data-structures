package com.ceenuts;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {

    public static void main(String[] args) {

        List<String> colorsImmutable = List.of("blue", "yellow");

        colorsImmutable.forEach(System.out::println);

        List<String> colors = new ArrayList<>();

        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");

        colors.forEach(System.out::println);

        for (String color: colors) {
            System.out.println(color);
        }

        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));
        System.out.println(colors);

    }
}
