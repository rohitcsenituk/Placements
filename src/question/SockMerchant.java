package question;

import java.util.Scanner;

public class SockMerchant {
    public static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        System.out.print(sockMerchant(n, ar));
    }

    private static int sockMerchant(int n, int[] ar) {
        for (int i = 0; i < n; i++) {
            if (ar[i] != 0) {
                for (int j = i + 1; j < n; j++) {
                    if (ar[i] == ar[j]) {
                        count++;
                        ar[j] = 0;
                        break;
                    }
                }
            }
        }

        return count;
    }
}
