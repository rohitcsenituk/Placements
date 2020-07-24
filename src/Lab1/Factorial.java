package Lab1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fact = 1;
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.print(fact);
    }
}
