package Lesson26_RemoveDuplicatesFromSortedArray;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount of elements: ");
        int amount = sc.nextInt();
        int[] nums = new int[amount];
        for (int i = 0; i < amount; i++) {
            nums[i] = sc.nextInt();
        }
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(nums));
    }
}
