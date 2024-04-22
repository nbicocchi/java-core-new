package com.nbicocchi.exercises.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MorseCode {

    private static Map<Character, String> conversionMap() {
        HashMap<Character, String> conversionMap = new HashMap<>();
        conversionMap.put('a', "._");
        conversionMap.put('b', "_...");
        conversionMap.put('c', "_._.");
        conversionMap.put('d', "_..");
        conversionMap.put('e', ".");
        conversionMap.put('f', ".._.");
        conversionMap.put('g', "__.");
        conversionMap.put('h', "....");
        conversionMap.put('i', "..");
        conversionMap.put('j', ".___");
        conversionMap.put('k', "_._");
        conversionMap.put('l', "._..");
        conversionMap.put('m', "__");
        conversionMap.put('n', "_.");
        conversionMap.put('o', "___");
        conversionMap.put('p', ".__.");
        conversionMap.put('q', "__._");
        conversionMap.put('r', "._.");
        conversionMap.put('s', "...");
        conversionMap.put('t', "_");
        conversionMap.put('u', ".._");
        conversionMap.put('v', "..._");
        conversionMap.put('w', ".__");
        conversionMap.put('x', "_.._");
        conversionMap.put('y', "_.__");
        conversionMap.put('z', "__..");
        return conversionMap;
    }

    public static String morseCode(String string) {
        Map<Character, String> conversionMap = conversionMap();
        StringBuilder builder = new StringBuilder();
        for (char c : string.toLowerCase().toCharArray()) {
            if (!conversionMap.containsKey(c)) {
                throw new IllegalArgumentException("String contains an unsupported character.");
            } else {
                builder.append(conversionMap.get(c)).append(" ");
            }
        }
        // trim() eventually removes the last space
        return builder.toString().trim();
    }
}
