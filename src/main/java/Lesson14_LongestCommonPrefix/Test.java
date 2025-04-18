package Lesson14_LongestCommonPrefix;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        String[] strs = new String[scanner.nextInt()];
        int i=0;
        while (true){
            System.out.println("Enter the string: ");
            String string = scanner.nextLine();
            if (string.isEmpty()) break;
            strs[i] = string;
            i++;
        }
        System.out.println(solution.longestCommonPrefix(strs));
    }
}
