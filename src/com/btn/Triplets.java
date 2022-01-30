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

        System.out.println(remaining);

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

        System.out.println(remaining);
        System.out.println(result);
        System.out.println(added);
        return "";
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
