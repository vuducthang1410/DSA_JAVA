package LongestPalindrome;

import java.util.Scanner;

public class Solution2 {
    public static String longestPalindrome(String s) {
        StringBuilder stringBuilder=new StringBuilder("#");
        for(char c:s.toCharArray()){
            stringBuilder.append(c).append("#");
        }
        int length=stringBuilder.length();
        int[] lengthSubString=new int[length];
        int center=0,right=0;
        for(int i=0;i<length;i++){
            while(i-right>=0&&i+right<length&&
            stringBuilder.charAt(i-right)==stringBuilder.charAt(i+right)){
                lengthSubString[i]++;
                right++;
            }
            right=0;
        }
        int maxLen = 0;
        for (int i = 0; i < length; i++) {
            if (lengthSubString[i] > maxLen) {
                maxLen = lengthSubString[i];
                center = i;
            }
        }

        int start = maxLen%2==0?(center- maxLen+1) / 2:(center- maxLen +1) / 2;
        return s.substring(start, start + maxLen-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to consider : ");
        String s = sc.nextLine();
        System.out.println(longestPalindrome(s));
    }
}
