package Lesson15_3Sum;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + i + " element:");
            values[i] = sc.nextInt();
        }
        solution.threeSum(values).forEach(e->
                e.forEach(System.out::println));
    }
}
