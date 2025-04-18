package Lesson17_LetterCombinationsPhoneNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Solution {
    Map<String, List<String>> map = Map.of(
            "2", List.of("a", "b", "c"),
            "3", List.of("d", "e", "f"),
            "4", List.of("g", "h", "i"),
            "5", List.of("j", "k", "l"),
            "6", List.of("m", "n", "o"),
            "7", List.of("p", "q", "r", "s"),
            "8", List.of("t", "u", "v"),
            "9", List.of("w", "x", "y", "z")
    );

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) return List.of();
        if (digits.length() == 1) {
            return map.get(digits);
        }
        List<String> result = new ArrayList<>();
        List<String> temp = map.get(digits.substring(0,1));
        digits=digits.substring(1);
        List<String> temp2 = letterCombinations(digits);
        temp.forEach(tempItem -> {
            temp2.forEach(tempItem2 -> {
                result.add(tempItem + tempItem2);
            });
        });
        return result;
    }
}
