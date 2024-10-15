package LongestPalindrome;

import java.util.Scanner;

public class lesson5LongestPalindrome {
    public static String longestPalindrome(String s) {
        int left;
        int right;
        int begin = 0;
        int length = s.length();
        int lengthSubString = 0;
        if (length <= 1) {
            return s;
        }
        for (int i = 0; i < length - 1; i++) {
            left = i;
            right = length - 1;
            int tempLength = right;
            while (true) {
                if (s.charAt(left) == s.charAt(right)) {
                    if (left == right) {
                        int temp = (left - i) * 2 + 1;
                        if (temp > lengthSubString) {
                            lengthSubString = temp;
                            begin = i;
                        }
                        break;
                    } else if (left == right + 1 && right == left - 1) {
                        int temp = (left - i) * 2;
                        if (temp > lengthSubString) {
                            lengthSubString = temp;
                            begin = i;
                        }
                        break;
                    }
                    left++;
                    right--;
                } else {
                    left = i;
                    if (left >= right) {
                        break;
                    }
                    right = tempLength--;
                }
            }
        }
        return s.substring(begin, begin + lengthSubString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to consider : ");
        String s = sc.nextLine();
        System.out.println(longestPalindrome(s));
    }
}
