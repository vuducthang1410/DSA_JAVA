import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LG_TEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrInput = new int[9];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 9; j++) {
                arrInput[j] = scanner.nextInt();
            }
            ArrayList<Integer> answer = new ArrayList<>();
            for (int j = 8; j >= 0; j--) {
                if (arrInput[j] > 0) {
                    while (arrInput[j] > 0) {
                        if (j != 5)
                            answer.add(j + 1);
                        else
                            answer.add(9);
                        arrInput[j]--;
                    }
                }
            }
            Integer[] kq = answer.toArray(new Integer[0]);
            Arrays.sort(kq);
            for (int k = kq.length - 1; k >= 0; k--) {
                System.out.print(kq[k]);
            }
            System.out.println();
        }
    }
}
