package question;

import java.util.Scanner;

/**
 * add element in end of an array
 */
public class ArrayEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 10;
        int[] arr = new int[capacity];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.print("Before Insertion: ");
        int n = 5;
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        // Inserting key
        System.out.print("Enter Value to be Inserted ");
        int key = scanner.nextInt();

        n = insertAtEnd(arr, n, key, capacity);

        System.out.print("\n After Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }

    private static int insertAtEnd(int[] arr, int n, int key, int capacity) {
        if (n >= capacity) {
            return n;
        }
        arr[n] = key;
        return n + 1;
    }

}
