package ZigzagConversion;

import java.util.Scanner;

public class Solution1 {
     static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }

        char[] res = new char[s.length()];
        int index = 0;
        int jumpInterval = 2 * (numRows - 1);
        for (int j = 0; j < s.length(); j += jumpInterval) {
            res[index] = s.charAt(j);
            index++;
        }

        for (int i = 1; i < numRows - 1; i++) {
            int middleJump = jumpInterval - 2 * (numRows - i - 1);
            for (int j = i; j < s.length(); j += middleJump) {
                res[index] = s.charAt(j);
                index++;
                middleJump = jumpInterval - middleJump;
            }
        }

        for (int j = numRows - 1; j < s.length(); j += jumpInterval) {
            res[index] = s.charAt(j);
            index++;
        }

        return new String(res);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        int numRow= scanner.nextInt();
        System.out.println(convert(s,numRow));
    }
}
