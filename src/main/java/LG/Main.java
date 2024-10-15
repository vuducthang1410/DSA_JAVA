package LG;

import java.util.*;

public class Main {
    public static void excute(int[] matrix, int k) {
        if (matrix.length == 0) {
            System.out.println(0);
            return;
        } else if (matrix.length == 1 || k == 0) {
            System.out.println(1);
            return;
        }
        int lp = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == 1) {
                lp++;
            }
        }
        if (lp % (k + 1) == 0) {
            if (lp != 0) {
                int countLoop = lp / (k + 1);
                int countX = 0;
                int x[] = new int[k];
                boolean start = true;
                boolean startCount = false;
                int temp = 0;
                int index = 0;
                int countValue = 0;
                for (int i = 0; i < matrix.length; i++) {
                    if (startCount) {
                        temp++;
                    }
                    if(matrix[i] == 1){
                        countValue+=1;
                    }

                    if (start&&countValue==countLoop) {
                        startCount = true;
                        start = false;
                    } else if (matrix[i] == 1&&countValue==countLoop+1) {
                        startCount = false;
                        start=true;
                        x[index] = temp;
                        temp = 0;
                        index++;
                        countValue = 0;
                        i--;
                    }
                }
                long result = 1;
                for (int i = 0; i < x.length; i++) {
                    result *= x[i];
                }
                long mod = 1000000007L;
                long a=result%mod;
                System.out.println(a);
            }
            else{
                long result = 1;
                for(int i=matrix.length-1;i>k;i--){
                    result*=i;
                }
                System.out.println(result);
            }
        } else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int T = scanner.nextInt();
            for (int i = 0; i < T; i++) {
                int N = scanner.nextInt();
                int K = scanner.nextInt();
                int[] matrix = new int[N];
                String data = scanner.next();
                String[] dataMatrix = data.split("");
                for (int k = 0; k < dataMatrix.length; k++) {
                    matrix[k] = Integer.parseInt(dataMatrix[k]);

                }
                excute(matrix, K - 1);
            }
        }
    }
}
