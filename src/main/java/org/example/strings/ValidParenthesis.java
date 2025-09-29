package org.example.strings;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * 1. Open brackets must be closed by the same type of brackets.
 * 2. Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 */
public class ValidParenthesis {
    public static boolean isValid (final String s) {
        final Stack<Character> stack = new Stack<>();

        if (s == null || s.isEmpty() || s.isBlank()) {
            return true;
        } else {
            for (int i = 0; i < s.length(); i++) {
                char pointer = s.charAt(i);

                if (pointer == '(' || pointer == '{' || pointer == '[') {
                    stack.push(pointer);
                } else if (pointer == ')') {
                    if (stack.isEmpty() || stack.lastElement() != '(') {
                        return false;
                    } else {
                        stack.pop();
                    }
                } else if (pointer == '}') {
                    if (stack.isEmpty() || stack.lastElement() != '{') {
                        return false;
                    } else {
                        stack.pop();
                    }
                } else if (pointer == ']') {
                    if (stack.isEmpty() || stack.lastElement() != '[') {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()")); // true
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]")); // false
        System.out.println(isValid("([)]")); // false
        System.out.println(isValid("{[]}")); // true
        System.out.println(isValid("}{")); // false
    }
}
