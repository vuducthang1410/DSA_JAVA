package Lesson8_StringToInteger;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an string: ");
        String s = scanner.nextLine();
        System.out.println(solution.myAtoi(s));
    }
}
