package question;

import java.util.Scanner;

/**
 * Find Numbers with Even Number of Digits
 */
public class FindEvenNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print(findEvenDigitNumber(numbers));
    }

    private static int findEvenDigitNumber(int[] numbers) {
        int count = 0;
        int temp = 0;
        for (int num : numbers
        ) {
            while (num != 0) {
                num /= 10;
                count++;
            }

            if (count % 2 == 0) {
                temp++;
            } else count = 0;
        }
        return temp;
    }
}
