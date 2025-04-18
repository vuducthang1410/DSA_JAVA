package Lesson11_ContainerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int h = Math.min(height[left], height[right]);
        int w = height.length;
        while (left <= right) {
            int minHTemp = Math.min(height[left], height[right]);
            if (minHTemp + (right - left) >= w + h && Math.abs(minHTemp - (right - left)) <= Math.abs(w - h)) {
                h = minHTemp;
                w = Math.abs(right - left);
            } else if (minHTemp * (right - left) > w * h) {
                h = minHTemp;
                w = Math.abs(right - left);
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return h * w;
    }
}
