package Lesson13_RomanToInteger;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scanner.nextLine();
        System.out.println(solution.romanToInt(s));
    }
}
