package Lesson67_AddBinary;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string a: ");
        String a = sc.nextLine();
        System.out.println("Enter string b: ");
        String b = sc.nextLine();
        Solution solution = new Solution();
        System.out.println(solution.addBinary(a,b));
    }
}
