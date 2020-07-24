package Lab1;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        //System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0 && number > i) {
                sum += i;
            }
        }
        if (sum == number) System.out.print("Yes");
        else System.out.print("NO");
    }
}
