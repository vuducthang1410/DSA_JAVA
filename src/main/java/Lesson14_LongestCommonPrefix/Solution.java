package Lesson14_LongestCommonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        if(strs.length == 1) return prefix;
        StringBuilder longestPrefix = new StringBuilder();
        for (int i = 0; i < prefix.length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length()<=i||prefix.charAt(i) != strs[j].charAt(i)) {
                    return longestPrefix.toString();
                }
            }
            longestPrefix.append(prefix.charAt(i));
        }
        return longestPrefix.toString();
    }
}
