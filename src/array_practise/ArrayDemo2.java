package array_practise;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Binary Search program
 */

public class ArrayDemo2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter Array Elements");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Enter Search Element");
        int key = scan.nextInt();
        int left = 0;
        int right = a.length - 1;

        binarySearch(a, left, right, key);
    }

    private static void binarySearch(int[] a, int left, int right, int key) {
        Arrays.sort(a);
        int mid = (left + right) / 2;
        while (left <= right) {

            if (key == a[mid]) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else if (key < a[mid]) {
                right = mid - 1;
            } else if (key > a[mid]) {
                left = mid + 1;
            } else System.out.println("Not Found in Array");
            mid = (left + right) / 2;
        }


    }
}
