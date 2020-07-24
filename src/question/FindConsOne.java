package question;

import java.util.Scanner;

public class FindConsOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int temp = 0;
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int value : array) {
            if (value == 1) {
                count++;
            } else count = 0;

            if (temp < count) temp = count;
        }
        System.out.print(temp);
    }
}
