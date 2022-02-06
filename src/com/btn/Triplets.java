package com.btn;

//        There is a secret string which is unknown to you.
//
//        Given a collection of random triplets from the string, recover the original string.
//
//        A triplet here is defined as a sequence of three letters such that
//
//        each letter occurs somewhere before the next in the given string. "whi" is a triplet for the string "whatisup".
//
//        As a simplification, you may assume that no letter occurs more than once in the secret string.
//
//        You can assume nothing about the triplets given to you other
//
//        than that they are valid triplets and that they contain sufficient information to deduce the original string.
//
//        In particular, this means that the secret string will never contain letters
//
//        that do not occur in one of the triplets given to you.

import java.util.*;

public class Triplets {

//            [t, u, p]
//            [w, h, i]
//            [t, s, u]
//            [a, t, s]
//            [h, a, p]
//            [t, i, s]
//            [w, h, s]
//            "whatisup"

    public static String recoverSecret(char[][] triplets) {
        Map<Character, Integer> result = new HashMap<>();
        for (char[] triplet : triplets) {
            for (char c : triplet) {
                if (!result.containsKey(c)) {
                    result.put(c, 0);
                }
            }
        }
        List<String> remaining = new ArrayList<>();
        List<String> added = new ArrayList<>();

        for (Character key : result.keySet()) {
            remaining.add(key.toString());
        }

        for (char[] triplet : triplets) {
            for(int i=0; i< triplet.length; i++){
                result.put(triplet[i], result.get(triplet[i]) + i);
            }
        }

        for (Character key : result.keySet()) {
            if (result.get(key) == 0){
                added.add(key.toString());
                remaining.remove(key.toString());
                result.remove(key);
                break;
                }
            }

        comparePlacements(remaining, added, triplets);
        return String.join("", added);
    }

    public static List<String> comparePlacements(List<String> remaining, List<String> added, char[][] triplets) {
        Map<String, Integer> result = new HashMap<>();
        for (String s : remaining) {
            if (!result.containsKey(s)) {
                result.put(s, 0);
            }
            for (char[] t : triplets) {
                for (int i = 0; i < t.length; i++) {
                    if (i == 1 && String.valueOf(t[i]).equals(s)) {
                        if (!listContains(added, String.valueOf(t[0]))){
                            result.put(String.valueOf(t[i]), result.get(String.valueOf(t[i])) + 1);
                        }
                    } else if (i == 2 && String.valueOf(t[i]).equals(s)) {
                        if (!listContains(added, String.valueOf(t[0])) || !listContains(added, String.valueOf(t[1]))){
                            result.put(String.valueOf(t[i]), result.get(String.valueOf(t[i])) + 1);
                        }
                    }
                }
            }
        }
        for (String key : result.keySet()) {
            if (result.get(key) == 0){
                added.add(key);
                remaining.remove(key);
                result.remove(key);
                break;
            }
        }

        if (remaining.size() > 0){
            comparePlacements(remaining, added, triplets);
        }
        return added;
    }

    public static boolean listContains(List<String> added, String input){
        for (String s : added) {
            if (input.equals(s)){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        // "whatisup"
        char[][] test = {{'t', 'u', 'p'}, {'w', 'h', 'i'},
                {'t', 's', 'u'}, {'a', 't', 's'},
                {'h', 'a', 'p'}, {'t', 'i', 's'},
                {'w', 'h', 's'}
        };
        recoverSecret(test);
    }
}
