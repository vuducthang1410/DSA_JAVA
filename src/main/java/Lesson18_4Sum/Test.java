package Lesson18_4Sum;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the target number: ");
        int target = scanner.nextInt();
        System.out.println("Enter the amount of arrays ");
        int length = scanner.nextInt();
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the " + i + "th number: ");
            nums[i] = scanner.nextInt();
        }
        solution.fourSum(nums, target);
    }
}
