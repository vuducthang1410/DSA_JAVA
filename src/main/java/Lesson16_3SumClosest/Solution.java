package Lesson16_3SumClosest;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int index = 0, left = index + 1, right = nums.length - 1;
        int sumTarget = nums[left] + nums[right] + nums[index];
        nums = Arrays.stream(nums).sorted().toArray();
        while (index < nums.length - 1 && left < right) {
            int sum = nums[left] + nums[right] + nums[index];
            if (Math.abs(target - sum) < Math.abs(target - sumTarget)) {
                sumTarget = sum;
            }
            if (sum - target > 0) {
                do {
                    right--;
                } while (right > left && nums[right] == nums[right + 1]);

            } else {
                do {
                    left++;
                } while (left < right && nums[left] == nums[left - 1]);
            }
            if (left >= right) {
                do {
                    index++;
                } while (index < nums.length && index > 0 && nums[index] == nums[index - 1]);
                left = index + 1;
                right = nums.length - 1;
            }
        }
        return sumTarget;
    }
}

