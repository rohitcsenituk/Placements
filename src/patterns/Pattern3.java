package patterns;

import java.util.Scanner;

/**
 * pattern 3
 * <p>
 * * * * * *
 * * * * *
 * * * *
 * * *
 * *
 */

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) System.out.print("  ");
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
}
