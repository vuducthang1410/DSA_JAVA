package Lesson16_3SumClosest;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the target: ");
        int target = scanner.nextInt();
        System.out.println("Enter amount element: ");
        int amount = scanner.nextInt();
        int[] nums = new int[amount];
        for (int i=0; i<amount; i++) {
            System.out.println("Enter element " + (i+1));
            nums[i] = scanner.nextInt();
        }
        System.out.println(solution.threeSumClosest(nums, target));
    }
}
