package Lesson33_SearchInRotatedSortedArray;

public class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            if(nums[left] != target) {
                left++;
            }else if(nums[left]==target) {
                return left;
            }
            if(nums[right] != target) {
                right--;
            } else if (nums[right]==target) {
                return right;
            }
        }
        return -1;
    }
}
