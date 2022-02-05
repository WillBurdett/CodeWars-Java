package com.btn;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BracketMatcher {

    public static boolean bracketsMatch(String input){
        String[] arr = input.replaceAll(" ", "").split("");
        Pattern pattern = Pattern.compile("[\\[\\](){}]");
        Stack<String> stack = new Stack<>();
        for (String s : arr) {
            Matcher matcher = pattern.matcher(s);
            if (!matcher.find()){
                return false;
            } else if (s.equals("(") || s.equals("{") || s.equals("[")){
                stack.push(s);
            } else if (s.equals(")")) {
                if (stack.peek().equals("(")) {
                    stack.pop();
                }
            } else if (s.equals("}")) {
                if (stack.peek().equals("{")) {
                    stack.pop();
                }
            } else if (s.equals("]")){
                    if (stack.peek().equals("[")){
                        stack.pop();
                    }
            }
        }
        if (stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(bracketsMatch("({{{}[[]]}})"));
    }
}
