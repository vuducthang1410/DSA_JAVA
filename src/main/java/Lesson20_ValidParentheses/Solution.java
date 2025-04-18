package Lesson20_ValidParentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if (s == null || s.isEmpty())
            return true;
        if (s.length() == 1)
            return false;
        if (s.length() % 2 == 1) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else {
                if (stack.isEmpty() || stack.pop() != c) return false;
            }
        }
        return stack.isEmpty();
    }

}
