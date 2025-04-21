package Lesson22_GenerateParentheses;

import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        if (n == 0) return List.of();
        if (n == 1) return List.of("(",")");
StringBuilder res = new StringBuilder();
        return List.of();
    }
    public void backtrack(int n){
        if (n == 0) return;
        for (int i = 0; i < n; i++) {

        }
        backtrack(n-1);
    }
}
