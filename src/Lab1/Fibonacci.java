package Lab1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long first = 0, second = 1, next;
        System.out.print(first + " ");
        System.out.print(second + " ");
        for (int i = 0; i < n - 2; i++) {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }

    }
}
