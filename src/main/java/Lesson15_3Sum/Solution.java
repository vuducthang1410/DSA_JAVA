package Lesson15_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }
        boolean isFullZero = false;
        nums = Arrays.stream(nums).sorted().toArray();
        int index = 0, left = index + 1, right = nums.length - 1;
        while (index < nums.length - 1&&left<right) {
            int sum = nums[left] + nums[right] + nums[index];
            if (left != index && right != index && sum == 0 && !isFullZero) {
                List<Integer> list = new ArrayList<>();
                list.add(nums[index]);
                list.add(nums[left]);
                list.add(nums[right]);
                result.add(list);
                if (nums[left] == 0 && nums[right] == 0 && nums[index] == 0) {
                    isFullZero = true;
                }
                do {
                    left++;
                } while (left < right && nums[left] == nums[left - 1]);

            } else if (sum > 0) {
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
        return result;
    }
}
