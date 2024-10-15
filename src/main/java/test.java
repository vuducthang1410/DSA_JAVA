import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class test implements Comparator{
    //    public static boolean check(int start, int mid, String text) {
//        for (int i = 0; i <= mid; i++) {
//            if (start -i < 0) return true;
//            if (text.charAt(start - i) != text.charAt(mid+ i)) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static boolean isPalindrome(String text) {
//        int length = text.length();
//        if (length <= 1) return true;
//
//        int mid = length / 2;
//        if (length % 2 == 0) {
//            return check(mid - 1, mid, text);
//        } else {
//            return check(mid, mid, text);
//        }
//    }
    public static int power(int a, int b) {
        try {
            if (a < 0 || b < 0) throw new Exception();
            try {
                if (a == 0 && b == 0) throw new Exception();
                else return (int) Math.pow(a, b);
            } catch (Exception e) {
                System.out.println("java.lang.Exception: n and p should not be zero.");
            }
        } catch (Exception e) {
            System.out.println("java.lang.Exception: n or p should not be negative.");
            return -1;
        }
        return (int) Math.pow(a, b);
    }

    public static boolean canWin(int leap, int[] game, int position) {
        if (position < 0 || game[position] == 1) {
            return false;
        }
        if (position + 1 >= game.length || position + leap >= game.length) {
            return true;
        }
        game[position] = 1;
        return canWin(leap, game, position + leap) ||
                canWin(leap, game, position + 1) ||
                canWin(leap, game, position - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        int count = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < t; i++) {
            String e = pair_left[i] + " " + pair_right[i];
            if (!set.contains(e)) {
                set.add(e);
                count++;
            }
            System.out.println(count);
        }
//Write your code here

    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}