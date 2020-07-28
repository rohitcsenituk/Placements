package question;

import java.util.Scanner;

/**
 * add element at any index of array
 */
public class ArrayAtAny {
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
        System.out.print("Enter Value to be Inserted: ");
        int key = scanner.nextInt();
        // Position of Inserting key
        System.out.print("Enter position: ");
        int position = scanner.nextInt();

        n = insertAtAny(arr, n, key, position - 1, capacity);

        System.out.print("\n After Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

    }

    private static int insertAtAny(int[] arr, int n, int key, int position, int capacity) {
        if (n >= capacity) {
            return n;
        }

        if (arr[position] != 0) {
            for (int i = n; i >= position; i--) {
                arr[i + 1] = arr[i];
            }
        }
        arr[position] = key;
        return n + 1;
    }
}
