package question;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Squares of a Sorted Array
 */
public class ArraySortSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        ArraySortSquare sortSquare = new ArraySortSquare();
        int[] result = sortSquare.sortedSquares(array);
        System.out.print(Arrays.toString(result));

    }

    public int[] sortedSquares(int @NotNull [] A) {

        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        java.util.Arrays.sort(A);
        return A;
    }
}
