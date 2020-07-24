package patterns;

import java.util.Scanner;

/**
 * pattern 5
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */


public class Pattern5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n + 1; j++) {
                if (j < n - i) {
                    System.out.print("  ");
                } else System.out.print("* ");

            }
            System.out.println();

        }
    }
}
