package Lesson17_LetterCombinationsPhoneNumber;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        System.out.println("Enter the digits: ");
        String digits = sc.nextLine();
        System.out.println(sol.letterCombinations(digits));
    }
}
