package Lesson26_RemoveDuplicatesFromSortedArray;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for (int i = 1; i < nums.length - 1; i++) {
            if(nums[i] != nums[i-1]) {
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
