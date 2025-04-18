package Lesson58_LengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        int maxLen = 0;
        for (int i = s.length()-1; i >0; i--) {
            if(s.charAt(i)!=' ') maxLen++;
            else if(maxLen!=0)break;
        }
        return maxLen;
    }
}
