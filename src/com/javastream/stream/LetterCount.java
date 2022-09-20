package com.javastream.stream;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LetterCount {
    public static void main(String[] args) {
        System.out.println(getTotalNumberOfLetterOfNamesThanFive("A", "b", "c", "volkan", "yazilimci"));

    }
    // Array elemanlarını al -> stream()
    // 5 ten uzun isimleri filitrele -> filter()
    // Geri kalan listedeki tum harflerin sayisini getir -> mapToInt()
    // harf sayilarini topla -> sum()
    public static int getTotalNumberOfLetterOfNamesThanFive(String...names){
        return Arrays.stream(names)
                .filter(name -> name.length() > 5 ) // Stream<String> if (name.length() > 5)
                .mapToInt(String::length)//Stream<Integer>
                .sum();


    }
}
