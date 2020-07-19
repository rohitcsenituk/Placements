package Lab1;

import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            if (i == n) {
                break;
            } else {
                System.out.println();
            }
        }
    }
}
