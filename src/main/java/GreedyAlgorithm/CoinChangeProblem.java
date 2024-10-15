package GreedyAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChangeProblem {
    public static void coinChange(int N, int[] denominations) {
        // Sắp xếp mệnh giá theo thứ tự giảm dần
        Arrays.sort(denominations);

        System.out.println("Số tiền cần đổi: " + N);
        System.out.println("Các mệnh giá có sẵn: " + Arrays.toString(denominations));

        // Biến theo dõi số tiền còn lại
        int remaining = N;
        int[] count = new int[denominations.length]; // Mảng lưu số lượng mỗi mệnh giá đã chọn

        // Đi ngược lại danh sách mệnh giá đã sắp xếp
        for (int i = denominations.length - 1; i >= 0; i--) {
            int coinValue = denominations[i];

            // Nếu mệnh giá hiện tại nhỏ hơn hoặc bằng số tiền còn lại
            while (coinValue <= remaining) {
                count[i]++;
                remaining -= coinValue; // Giảm số tiền còn lại
            }
        }

        // In ra số đồng tiền đã chọn
        for (int i = 0; i < denominations.length; i++) {
            if (count[i] > 0) {
                System.out.println("Chọn " + count[i] + " đồng mệnh giá " + denominations[i]);
            }
        }

        // Nếu không thể đổi hết toàn bộ số tiền, in ra thông báo không khả thi
        if (remaining > 0) {
            System.out.println("Không thể đổi số tiền " + N + " với các mệnh giá đã cho.");
        } else {
            System.out.println("Đổi tiền thành công.");
        }
    }

    public static void main(String[] args) {
        int N = 68;  // Số tiền cần đổi
        int[] denominations = {2, 7, 10, 20, 30, 50};  // Các mệnh giá tiền

        coinChange(N, denominations);
    }
}
