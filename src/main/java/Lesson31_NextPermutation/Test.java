package Lesson31_NextPermutation;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        System.out.println("Enter the length of the array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter the " + (i+1) + "th number: ");
            arr[i] = sc.nextInt();
        }
        sol.nextPermutation(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
