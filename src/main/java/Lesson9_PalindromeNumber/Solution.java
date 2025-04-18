package Lesson9_PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        if (x < 10)
            return true;
        int length = String.valueOf(x).length();
        int center = length / 2;
        int index = 1;
        long temp = 0;
        int xTemp = x;
        while (index <= center) {
            int left = xTemp % 10;
            temp = (long) (temp + left * Math.pow(10, length - index));
            if (x / temp != 1) {
                return false;
            }
            xTemp = xTemp / 10;
            index++;
        }
        return true;
    }
}
