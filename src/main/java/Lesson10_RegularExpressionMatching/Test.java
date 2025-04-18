package Lesson10_RegularExpressionMatching;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String a: ");
        String a = sc.nextLine();
        System.out.println("Enter a String b: ");
        String b = sc.nextLine();
        Solution solution = new Solution();
        System.out.println(solution.isMatch(a.toLowerCase(), b.toLowerCase()));
    }
}
