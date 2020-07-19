package patterns;

import java.util.Scanner;

/**
 *  pattern 4
 *  * * * * *
 *  * * * *
 *  * * *
 *  * *
 *  *
 */
public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
