package Lesson18_4Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        nums = Arrays.stream(nums).sorted().toArray();
        int index = 0, left = index + 1, leftTemp = left + 1, right = nums.length - 1;
        boolean isFullTwo=false;
        while (index < nums.length - 3) {
            long sum = (long)nums[index] + nums[left] + nums[leftTemp] + nums[right];
            if (sum == target&&!isFullTwo) {
                List<Integer> list = new ArrayList<>();
                list.add(nums[index]);
                list.add(nums[left]);
                list.add(nums[leftTemp]);
                list.add(nums[right]);
                res.add(list);
                if(nums[index]==2&&nums[left]==2&&nums[right]==2&&nums[leftTemp]==2){
                    isFullTwo=true;
                }
                do{
                    leftTemp++;
                }while (leftTemp<right&&nums[leftTemp]==nums[leftTemp-1]);
            } else if (sum < target && leftTemp < right) {
                do{
                    leftTemp++;
                }while (leftTemp<right&&nums[leftTemp]==nums[leftTemp-1]);
            } else if (sum > target && right > leftTemp) {
                do {
                    right--;
                }while (right>leftTemp&&nums[right]==nums[right+1]);
            }else if (sum < target) {
                do{
                    left++;
                }while (left<leftTemp&&nums[left]==nums[left-1]);
                leftTemp = left + 1;
                right=nums.length-1;
            }
            if(leftTemp>=right){
                do{
                    left++;
                }while (left<leftTemp&&nums[left]==nums[left-1]);
                leftTemp = left + 1;
                right=nums.length-1;
            }
            if(left>=right-1||isFullTwo){
                do{
                    index++;
                }while (nums[index]==nums[index-1]&&index<right-2);
                left = index + 1;
                leftTemp = left + 1;
                right = nums.length - 1;
            }
        }
        return res;
    }
}
