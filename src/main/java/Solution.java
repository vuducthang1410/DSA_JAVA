import java.util.*;

class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length=nums1.length+nums2.length;
        int smaller[]=nums1.length<nums2.length?nums1:nums2;
        int bigger[]=nums1.length>nums2.length?nums1:nums2;
        boolean even=length%2==0;
        int targer=length/2;
        targer+=even?0:1;
        int l=0;
        int r=smaller.length-1;
        while (true){
            int mid = r==-1?Integer.MAX_VALUE:(l+r)/2;
            int midValue=r==-1?Integer.MIN_VALUE:smaller[mid];
            int afterMid=mid+1<smaller.length?Integer.MAX_VALUE:smaller[mid+1];
            int temp=length-(mid+1);
            int biggerValue=temp==-1?Integer.MIN_VALUE:bigger[temp-1];
            int afterBigger=temp<bigger.length?Integer.MAX_VALUE:bigger[temp];
            if(midValue<=afterMid&&biggerValue<=afterMid){
                if(!even){
                    return Math.max(midValue,biggerValue);
                }else{
                    return (double) (Math.max(biggerValue, midValue) + Math.max(afterBigger, afterMid)) /2;
                }
            }else if(midValue>afterBigger){
                r=mid+1;
            }else{
                l=mid-1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng thứ nhất :");
        int m = scanner.nextInt();
        System.out.println("Nhập vào độ dài mảng thứ hai : ");
        int n = scanner.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        for (int i = 0; i < m; i++) {
            System.out.println("arr1[" + i + "] = ");
            arr1[i] = scanner.nextInt();
        }
        for (int j = 0; j < n; j++) {
            System.out.println("arr2[" + j + "]= ");
            arr2[j] = scanner.nextInt();
        }
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}