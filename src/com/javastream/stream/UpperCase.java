package com.javastream.stream;

import java.util.*;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {

        System.out.println(mapToUpperCase2("Ad", "a", "b"));
        List<String> stringList = new ArrayList<>();
        stringList.add("Ad");
        stringList.add("a");
        stringList.add("b");

        System.out.println(mapToUpperCase3(stringList));

    }

    public static Collection<String> mapToUpperCase (String...names){
        Collection<String> uppercaseNames = new ArrayList<>();

        for (String name: names){
            uppercaseNames.add(name.toUpperCase(Locale.ROOT));
        }
        return uppercaseNames;

    }

    //Array elemanlarinin tamamını al -> stream()
    // Buyuk harfe cevir => map
    // Liste olarak geri don => collect()


    public static Collection<String> mapToUpperCase2 (String...names){
        return Arrays.stream(names)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

    }

    public static List<String> mapToUpperCase3 (List<String> names){
        return names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

    }

}
