package patterns;

import java.util.Scanner;

/**
 * patterns 1
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 * * * * * *
 */
public class Pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
