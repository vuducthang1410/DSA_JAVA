package Lesson7_ReverseInteger;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: " );
        int number = sc.nextInt();
        System.out.println(solution.reverse(number));
    }
}
